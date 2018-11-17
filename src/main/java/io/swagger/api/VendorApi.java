/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.0).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;
import org.brapi.test.BrAPITestServer.exceptions.BrAPIServerException;

import io.swagger.model.VendorOrderRequest;
import io.swagger.model.VendorOrderResponse;
import io.swagger.model.VendorOrderResultsResponse;
import io.swagger.model.VendorOrderStatusResponse;
import io.swagger.model.VendorOrdersResponse;
import io.swagger.model.VendorPlateGetResponse1;
import io.swagger.model.VendorPlateResponse;
import io.swagger.model.VendorPlatesResponse;
import io.swagger.model.VendorPlatesSubmissionRequest;
import io.swagger.model.VendorSpecificationResponse;
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
import java.util.ArrayList;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-11-06T17:40:52.157-05:00[America/New_York]")

@Api(value = "vendor", description = "the vendor API")
public interface VendorApi {

    @ApiOperation(value = "List current available orders", nickname = "vendorOrdersGet", notes = "List current available orders", response = VendorOrdersResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Vendor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VendorOrdersResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = "/vendor/orders",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<VendorOrdersResponse> vendorOrdersGet(@ApiParam(value = "The order id returned by the vendor when the order was successfully submitted. From response of \"POST /vendor/orders\"") @Valid @RequestParam(value = "orderId", required = false) String orderId,@ApiParam(value = "The submission id returned by the vendor when a set of plates was successfully submitted. From response of \"POST /vendor/plates\"") @Valid @RequestParam(value = "submissionId", required = false) String submissionId,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the Plates for a specific Order", nickname = "vendorOrdersOrderIdPlatesGet", notes = "Retrieve the plate and sample details of an order being processed", response = VendorPlatesResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Vendor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VendorPlatesResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/vendor/orders/{orderId}/plates",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<VendorPlatesResponse> vendorOrdersOrderIdPlatesGet(@ApiParam(value = "The order id returned by the vendor when the order was successfully submitted.",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the results of a specific Order", nickname = "vendorOrdersOrderIdResultsGet", notes = "Retrieve the data files generated by the vendors analysis", response = VendorOrderResultsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Vendor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VendorOrderResultsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/vendor/orders/{orderId}/results",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<VendorOrderResultsResponse> vendorOrdersOrderIdResultsGet(@ApiParam(value = "The order id returned by the vendor when the order was successfully submitted.",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the status of a specific Order", nickname = "vendorOrdersOrderIdStatusGet", notes = "Retrieve the current status of an order being processed", response = VendorOrderStatusResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Vendor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VendorOrderStatusResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/vendor/orders/{orderId}/status",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<VendorOrderStatusResponse> vendorOrdersOrderIdStatusGet(@ApiParam(value = "The order id returned by the vendor when the order was successfully submitted.",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Submit New Order", nickname = "vendorOrdersPost", notes = "Submit a new order to a vendor", response = VendorOrderResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Vendor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VendorOrderResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = "/vendor/orders",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<VendorOrderResponse> vendorOrdersPost(@ApiParam(value = ""  )  @Valid @RequestBody VendorOrderRequest body,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Submit a new set of Sample data", nickname = "vendorPlatesPost", notes = "Submit a new set of Sample data", response = VendorPlateResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Vendor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VendorPlateResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = "/vendor/plates",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<VendorPlateResponse> vendorPlatesPost(@ApiParam(value = ""  )  @Valid @RequestBody VendorPlatesSubmissionRequest body,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the data for a submitted set of plates", nickname = "vendorPlatesSubmissionIdGet", notes = "Get data for a submitted set of plates", response = VendorPlateGetResponse1.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Vendor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VendorPlateGetResponse1.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/vendor/plates/{submissionId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<VendorPlateGetResponse1> vendorPlatesSubmissionIdGet(@ApiParam(value = "",required=true) @PathVariable("submissionId") String submissionId) throws BrAPIServerException;


    @ApiOperation(value = "Get the Vendor Specifications", nickname = "vendorSpecificationsGet", notes = "Defines the plate format specification for the vendor.", response = VendorSpecificationResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Vendor", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VendorSpecificationResponse.class) })
    @RequestMapping(value = "/vendor/specifications",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<VendorSpecificationResponse> vendorSpecificationsGet(@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;

}
