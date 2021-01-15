package io.swagger.api;

import io.swagger.model.PartyAccountCreate;
import io.swagger.model.PartyAccountUpdate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.Exception.CustomException;
import io.swagger.annotations.*;
import io.swagger.controller.AccountManagementController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import io.swagger.model.Error;
import java.util.Arrays;
import org.springframework.web.bind.annotation.CrossOrigin;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-07T17:56:26.652Z")


@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class PartyAccountApiController implements PartyAccountApi {

    private static final Logger log = LoggerFactory.getLogger(PartyAccountApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PartyAccountApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> createPartyAccount(
            @ApiParam(value = "The PartyAccount to be created" ,required=true )  @Valid @RequestBody PartyAccountCreate partyAccount
    ) {
        System.out.println("Start CreatePartyAccount--------------------");
        Object response; 
        Integer statusCode = 200;
        try {
            System.out.println("Request: " + partyAccount);
            response = AccountManagementController.createAccount(partyAccount);
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e);
            statusCode = Integer.parseInt(e.getFaultObject().getCode());
            response = e.getFaultObject();
        } catch (Exception ex) {
            System.out.println("General exception: " + ex);
            statusCode = 500;
            Error error = new Error();
            String message = "Something went wrong";
            error.setCode(statusCode.toString());
            error.setMessage(message);
            response = error;
        }
        
        System.out.println("Response: " + response);
        System.out.println("End CreatePartyAccount------------------------");
        return new ResponseEntity<>(response, HttpStatus.valueOf(statusCode));
    }

    public ResponseEntity<Void> deletePartyAccount(@ApiParam(value = "Identifier of the PartyAccount",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> listPartyAccount(
            @ApiParam(value = "User that requests the list") @Valid @RequestParam(value = "user", required = false) String userId,
            @ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,
            @ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,
            @ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit
    ) {
        System.out.println("Start ListPartyAccount");
        Object response; 
        Integer statusCode = 200;
        try {
            System.out.println("Request: " + userId);
            response = AccountManagementController.listAccount(userId);
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e);
            statusCode = Integer.parseInt(e.getFaultObject().getCode());
            response = e.getFaultObject();
        } catch (Exception ex) {
            System.out.println("General exception: " + ex);
            statusCode = 500;
            Error error = new Error();
            String message = "Something went wrong";
            error.setCode(statusCode.toString());
            error.setMessage(message);
            response = error;
        }
        
        System.out.println("Response: " + response);
        System.out.println("End ListPartyAccount");
        return new ResponseEntity<>(response, HttpStatus.valueOf(statusCode));
    }

    public ResponseEntity<Object> patchPartyAccount(
            @ApiParam(value = "Identifier of the PartyAccount",required=true) @PathVariable("id") String id,
            @ApiParam(value = "The PartyAccount to be updated" ,required=true )  @Valid @RequestBody PartyAccountUpdate partyAccount
    ) {
        System.out.println("Start PatchPartyAccount");
        Object response; 
        Integer statusCode = 200;
        try {
            System.out.println("Request: " + Arrays.toString(new Object []{partyAccount, id}));
            response = AccountManagementController.patchAccount(id, partyAccount);
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e);
            statusCode = Integer.parseInt(e.getFaultObject().getCode());
            response = e.getFaultObject();
        } catch (Exception ex) {
            System.out.println("General exception: " + ex);
            statusCode = 500;
            Error error = new Error();
            String message = "Something went wrong";
            error.setCode(statusCode.toString());
            error.setMessage(message);
            response = error;
        }
        
        System.out.println("Response: " + response);
        System.out.println("End PatchPartyAccount");
        return new ResponseEntity<>(response, HttpStatus.valueOf(statusCode));
    }

    public ResponseEntity<Object> retrievePartyAccount(
            @ApiParam(value = "Identifier of the PartyAccount",required=true) @PathVariable("id") String id,
            @ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields
    ) {        
        System.out.println("Start RetrievePartyAccount");
        Object response; 
        Integer statusCode = 200;
        try {
            System.out.println("-----------Request for RetrievePartyAccount: " + id);
            response = AccountManagementController.getAccount(id);
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e);
            statusCode = Integer.parseInt(e.getFaultObject().getCode());
            response = e.getFaultObject();
        } catch (Exception ex) {
            System.out.println("General exception: " + ex);
            statusCode = 500;
            Error error = new Error();
            String message = "Something went wrong";
            error.setCode(statusCode.toString());
            error.setMessage(message);
            response = error;
        }
        
        System.out.println("---------Response: " + response);
        System.out.println("End RetrievePartyAccount");
        return new ResponseEntity<>(response, HttpStatus.valueOf(statusCode));
    }

}
