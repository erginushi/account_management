/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.swagger.Exception;

import io.swagger.model.Error;

/**
 *
 * @author erginushi
 */

public class CustomException extends Exception {
    private int code;
    private String message;
    
    private Error faultObject;
    
    public CustomException(Error faultObject) {
        super(faultObject.getMessage());
        this.faultObject = faultObject;
    }
    
    public Error getFaultObject() {
        return faultObject;
    }

    public void setFaultObject(Error faultObject) {
        this.faultObject = faultObject;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
