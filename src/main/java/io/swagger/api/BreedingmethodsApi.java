/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.0).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;
import org.brapi.test.BrAPITestServer.exceptions.BrAPIServerException;

import io.swagger.model.BreedingMethodResponse;
import io.swagger.model.BreedingMethodsResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T14:32:54.779-05:00[America/New_York]")

@Api(value = "breedingmethods", description = "the breedingmethods API")
public interface BreedingmethodsApi {

    @ApiOperation(value = "Get the details of a specific Breeding Method", nickname = "breedingmethodsBreedingMethodDbIdGet", notes = "Get the details of a specific Breeding Method used to produce Germplasm", response = BreedingMethodResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Germplasm", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = BreedingMethodResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/breedingmethods/{breedingMethodDbId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BreedingMethodResponse> breedingmethodsBreedingMethodDbIdGet(@ApiParam(value = "Internal database identifier for a breeding method",required=true) @PathVariable("breedingMethodDbId") String breedingMethodDbId,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the Breeding Methods", nickname = "breedingmethodsGet", notes = "Get the list of germplasm breeding methods available in a system.", response = BreedingMethodsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Germplasm", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = BreedingMethodsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = "/breedingmethods",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<BreedingMethodsResponse> breedingmethodsGet(@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;

}
