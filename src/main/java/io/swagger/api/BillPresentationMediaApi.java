/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.BillPresentationMedia;
import io.swagger.model.BillPresentationMediaCreate;
import io.swagger.model.BillPresentationMediaUpdate;
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

@Api(value = "billPresentationMedia", description = "the billPresentationMedia API")
@RequestMapping(value = "/tmf-api/accountManagement/v4/")
public interface BillPresentationMediaApi {

    @ApiOperation(value = "Creates a BillPresentationMedia", nickname = "createBillPresentationMedia", notes = "This operation creates a BillPresentationMedia entity.", response = BillPresentationMedia.class, tags={ "billPresentationMedia", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = BillPresentationMedia.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/billPresentationMedia",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    ResponseEntity<BillPresentationMedia> createBillPresentationMedia(@ApiParam(value = "The BillPresentationMedia to be created" ,required=true )  @Valid @RequestBody BillPresentationMediaCreate billPresentationMedia);


    @ApiOperation(value = "Deletes a BillPresentationMedia", nickname = "deleteBillPresentationMedia", notes = "This operation deletes a BillPresentationMedia entity.", tags={ "billPresentationMedia", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Deleted"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/billPresentationMedia/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteBillPresentationMedia(@ApiParam(value = "Identifier of the BillPresentationMedia",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "List or find BillPresentationMedia objects", nickname = "listBillPresentationMedia", notes = "This operation list or find BillPresentationMedia entities", response = BillPresentationMedia.class, responseContainer = "List", tags={ "billPresentationMedia", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BillPresentationMedia.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/billPresentationMedia",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    ResponseEntity<List<BillPresentationMedia>> listBillPresentationMedia(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "Updates partially a BillPresentationMedia", nickname = "patchBillPresentationMedia", notes = "This operation updates partially a BillPresentationMedia entity.", response = BillPresentationMedia.class, tags={ "billPresentationMedia", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated", response = BillPresentationMedia.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/billPresentationMedia/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.PATCH)
    ResponseEntity<BillPresentationMedia> patchBillPresentationMedia(@ApiParam(value = "Identifier of the BillPresentationMedia",required=true) @PathVariable("id") String id,@ApiParam(value = "The BillPresentationMedia to be updated" ,required=true )  @Valid @RequestBody BillPresentationMediaUpdate billPresentationMedia);


    @ApiOperation(value = "Retrieves a BillPresentationMedia by ID", nickname = "retrieveBillPresentationMedia", notes = "This operation retrieves a BillPresentationMedia entity. Attribute selection is enabled for all first level attributes.", response = BillPresentationMedia.class, tags={ "billPresentationMedia", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BillPresentationMedia.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/billPresentationMedia/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    ResponseEntity<BillPresentationMedia> retrieveBillPresentationMedia(@ApiParam(value = "Identifier of the BillPresentationMedia",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields);

}
