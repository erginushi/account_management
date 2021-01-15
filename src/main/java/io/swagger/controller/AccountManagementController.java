/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.controller;

import io.swagger.Exception.CustomException;
import io.swagger.database.DatabaseService;
import io.swagger.model.PartyAccountCreate;
import io.swagger.model.PartyAccountUpdate;
import java.sql.SQLException;

/**
 *
 * @author ergi
 */
public class AccountManagementController {
    public static Object getAccount(String id) throws CustomException, SQLException, Exception {
        return DatabaseService.getAccount(id);
    }
    
    public static Object patchAccount(String id, PartyAccountUpdate partyAccount) throws CustomException, SQLException, Exception {
        return DatabaseService.patchAccount(id, partyAccount);
    }
    
    public static Object listAccount(String id) throws CustomException, SQLException, Exception {
        return DatabaseService.listAccount(id);
    }
    
    public static Object createAccount(PartyAccountCreate partyAccount) throws CustomException, SQLException, Exception {
        return DatabaseService.createAccount(partyAccount);
    }
}
