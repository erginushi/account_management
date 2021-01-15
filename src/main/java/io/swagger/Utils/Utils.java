/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.Utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

/**
 *
 * @author erginushi
 */
public class Utils {
    
    public static String jsonToString(Object obj) throws JsonProcessingException{
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(obj); 
        
        return jsonStr;
    }
    
    public static Object stringToJson(String str, Class cls) throws JsonProcessingException, IOException{
        ObjectMapper mapper = new ObjectMapper();
        
        return mapper.readValue(str, cls);
    }
}
