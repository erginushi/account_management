package io.swagger.database;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.Exception.CustomException;
import io.swagger.Utils.DataSource;
import io.swagger.Utils.Utils;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import io.swagger.model.Error;
import io.swagger.model.PartyAccount;
import io.swagger.model.PartyAccountCreate;
import io.swagger.model.PartyAccountUpdate;


/**
 *
 * @author erginushi
 */
public class DatabaseService {
    
    public static Object getAccount(String id) throws CustomException, IOException, SQLException, Exception {
        Object response = null;
        
        String procedure = "{ call getAccount(?) } ";
        Object [] params = {
            id
        };
        
        System.out.println("getAccount(?): " + Arrays.toString(params));
        try (Connection connection = DataSource.getConnection(); PreparedStatement pstmt = setParams(connection, procedure, params); ResultSet rs = pstmt.executeQuery();){
            while (rs.next()) {
                String json = rs.getString("response");
                String validity = rs.getString("validity");
                System.out.println(json);
                if(Integer.parseInt(validity) == 1){
                    System.out.println("DB, validity: " + validity);
                    System.out.println("DB, response: " + json);
                    Error error = (Error) Utils.stringToJson(json, Error.class);
                    throw new CustomException(error);
                }
                ObjectMapper mapper = new ObjectMapper();
                
                response = mapper.readValue(json, new TypeReference<PartyAccount>(){});
                System.out.println("DB, response: " + response);
            }
        }
        
        return response;
    } 
    
    public static Object patchAccount(String id, PartyAccountUpdate partyAccount) throws CustomException, IOException, SQLException, Exception {
        Object response = null;
        
        String partyAccountStr = Utils.jsonToString(partyAccount);
        String procedure = "{ call patchAccount(?,?) } ";
        Object [] params = {
            id,
            partyAccountStr
        };
        
        System.out.println("patchAccount(?,?): " + Arrays.toString(params));
        try (Connection connection = DataSource.getConnection(); PreparedStatement pstmt = setParams(connection, procedure, params); ResultSet rs = pstmt.executeQuery();){
            while (rs.next()) {
                String json = rs.getString("response");
                String validity = rs.getString("validity");
                System.out.println(json);
                if(Integer.parseInt(validity) == 1){
                    System.out.println("DB, validity: " + validity);
                    System.out.println("DB, response: " + json);
                    Error error = (Error) Utils.stringToJson(json, Error.class);
                    throw new CustomException(error);
                }
                ObjectMapper mapper = new ObjectMapper();
                
                response = mapper.readValue(json, new TypeReference<PartyAccount>(){});
                System.out.println("DB, response: " + response);
            }
        }
        
        return response;
    }
    
    public static Object listAccount(String id) throws CustomException, IOException, SQLException, Exception {
        Object response = null;
        
        String procedure = "{ call listAccount(?) } ";
        Object [] params = {
            id
        };
        
        System.out.println("listAccount(?): " + Arrays.toString(params));
        try (Connection connection = DataSource.getConnection(); PreparedStatement pstmt = setParams(connection, procedure, params); ResultSet rs = pstmt.executeQuery();){
            while (rs.next()) {
                String json = rs.getString("response");
                String validity = rs.getString("validity");
                System.out.println(json);
                if(Integer.parseInt(validity) == 1){
                    System.out.println("DB, validity: " + validity);
                    System.out.println("DB, response: " + json);
                    Error error = (Error) Utils.stringToJson(json, Error.class);
                    throw new CustomException(error);
                }
                ObjectMapper mapper = new ObjectMapper();
                
                response = mapper.readValue(json, new TypeReference<List<PartyAccount>>(){});
                System.out.println("DB, response: " + response);
            }
        }
        
        return response;
    }
    
    public static Object createAccount(PartyAccountCreate partyAccount) throws CustomException, IOException, SQLException, Exception {
        Object response = null;
        String partyAccountStr = Utils.jsonToString(partyAccount);
        
        String procedure = "{ call createAccount(?) } ";
        Object [] params = {
            partyAccountStr
        };
        
        System.out.println("createAccount(?): " + Arrays.toString(params));
        try (Connection connection = DataSource.getConnection(); PreparedStatement pstmt = setParams(connection, procedure, params); ResultSet rs = pstmt.executeQuery();){
            while (rs.next()) {
                String json = rs.getString("response");
                String validity = rs.getString("validity");
                System.out.println(json);
                if(Integer.parseInt(validity) == 1){
                    System.out.println("DB, validity: " + validity);
                    System.out.println("DB, response: " + json);
                    Error error = (Error) Utils.stringToJson(json, Error.class);
                    throw new CustomException(error);
                }
                ObjectMapper mapper = new ObjectMapper();
                
                response = mapper.readValue(json, new TypeReference<PartyAccount>(){});
                System.out.println("DB, response: " + response);
            }
        }
        
        return response;
    }
    
    public static PreparedStatement setParams(Connection connection, String procedure, Object[] params) throws SQLException{
        PreparedStatement pstmt = connection.prepareStatement(procedure);
        for(int i = 0; i < params.length; i++){
            pstmt.setObject(i + 1, params[i]);
        }
        
        return pstmt;
    }
}
