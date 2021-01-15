/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.BillingCycleSpecification;
import io.swagger.model.BillingCycleSpecificationCreate;
import io.swagger.model.BillingCycleSpecificationUpdate;
import io.swagger.model.Error;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-07T17:56:26.652Z")

@Api(value = "billingCycleSpecification", description = "the billingCycleSpecification API")
@RequestMapping(value = "/tmf-api/accountManagement/v4/")
public interface BillingCycleSpecificationApi {

    @ApiOperation(value = "Creates a BillingCycleSpecification", nickname = "createBillingCycleSpecification", notes = "This operation creates a BillingCycleSpecification entity.", response = BillingCycleSpecification.class, tags={ "billingCycleSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = BillingCycleSpecification.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/billingCycleSpecification",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    ResponseEntity<BillingCycleSpecification> createBillingCycleSpecification(@ApiParam(value = "The BillingCycleSpecification to be created" ,required=true )  @Valid @RequestBody BillingCycleSpecificationCreate billingCycleSpecification);


    @ApiOperation(value = "Deletes a BillingCycleSpecification", nickname = "deleteBillingCycleSpecification", notes = "This operation deletes a BillingCycleSpecification entity.", tags={ "billingCycleSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Deleted"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/billingCycleSpecification/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteBillingCycleSpecification(@ApiParam(value = "Identifier of the BillingCycleSpecification",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "List or find BillingCycleSpecification objects", nickname = "listBillingCycleSpecification", notes = "This operation list or find BillingCycleSpecification entities", response = BillingCycleSpecification.class, responseContainer = "List", tags={ "billingCycleSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BillingCycleSpecification.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/billingCycleSpecification",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    ResponseEntity<List<BillingCycleSpecification>> listBillingCycleSpecification(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "Updates partially a BillingCycleSpecification", nickname = "patchBillingCycleSpecification", notes = "This operation updates partially a BillingCycleSpecification entity.", response = BillingCycleSpecification.class, tags={ "billingCycleSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated", response = BillingCycleSpecification.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/billingCycleSpecification/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.PATCH)
    ResponseEntity<BillingCycleSpecification> patchBillingCycleSpecification(@ApiParam(value = "Identifier of the BillingCycleSpecification",required=true) @PathVariable("id") String id,@ApiParam(value = "The BillingCycleSpecification to be updated" ,required=true )  @Valid @RequestBody BillingCycleSpecificationUpdate billingCycleSpecification);


    @ApiOperation(value = "Retrieves a BillingCycleSpecification by ID", nickname = "retrieveBillingCycleSpecification", notes = "This operation retrieves a BillingCycleSpecification entity. Attribute selection is enabled for all first level attributes.", response = BillingCycleSpecification.class, tags={ "billingCycleSpecification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BillingCycleSpecification.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/billingCycleSpecification/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    ResponseEntity<BillingCycleSpecification> retrieveBillingCycleSpecification(@ApiParam(value = "Identifier of the BillingCycleSpecification",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields);

}