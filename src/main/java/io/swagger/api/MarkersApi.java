/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.0).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;
import org.brapi.test.BrAPITestServer.exceptions.BrAPIServerException;

import io.swagger.model.MarkerResponse;
import io.swagger.model.MarkersResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T14:32:54.779-05:00[America/New_York]")

@Api(value = "markers", description = "the markers API")
public interface MarkersApi {

    @ApiOperation(value = "Get the Markers", nickname = "markersGet", notes = "Other service requests use the servers internal `markerDbId`. This service returns marker records that provide the markerDbId. For the requested name or synonym, returns an array (possibly empty) of marker records that match the search criteria. If there is none, an empty array is returned. If there is one or more than one match, returns an array of all marker records that match the search criteria.", response = MarkersResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Markers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MarkersResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = "/markers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<MarkersResponse> markersGet(@ApiParam(value = "The database ID of the markers to search for") @Valid @RequestParam(value = "markerDbId", required = false) String markerDbId,@ApiParam(value = "The search paramater for a marker name or synonym.") @Valid @RequestParam(value = "markerName", required = false) String markerName,@ApiParam(value = "DEPRECAED in v1.3 - see \"markerName\"") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "DEPRECAED in v1.3 - see /search/markers", allowableValues = "case_insensitive, exact, wildcard") @Valid @RequestParam(value = "matchMethod", required = false) String matchMethod,@ApiParam(value = "Whether to include synonyms in the output.") @Valid @RequestParam(value = "includeSynonyms", required = false) Boolean includeSynonyms,@ApiParam(value = "DEPRECATED in v1.1 - see \"includeSynonyms\"") @Valid @RequestParam(value = "include", required = false) String include,@ApiParam(value = "The type of the marker.") @Valid @RequestParam(value = "type", required = false) String type,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the details for a specific Marker", nickname = "markersMarkerDbIdGet", notes = "Status: ACCEPTED  Implemented By:", response = MarkerResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Markers", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MarkerResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/markers/{markerDbId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<MarkerResponse> markersMarkerDbIdGet(@ApiParam(value = "the internal id of the marker",required=true) @PathVariable("markerDbId") String markerDbId,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;

}
