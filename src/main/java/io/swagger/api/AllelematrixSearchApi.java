/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.0).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;
import org.brapi.test.BrAPITestServer.exceptions.BrAPIServerException;

import io.swagger.model.AlleleMatrixSearchRequest;
import io.swagger.model.AlleleMatrixValuesResponse1;
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

@Api(value = "allelematrix-search", description = "the allelematrix-search API")
public interface AllelematrixSearchApi {

    @ApiOperation(value = "Scores through GET", nickname = "allelematrixSearchGet", notes = "Status: ACCEPTED.  Implemented by: Germinate (POST only), Cassavabase  Used by: Flapjack (POST only)  See Search Services for additional implementation details.  This uses a more efficient data structure and pagination for large number of markers.  See Search Services for additional implementation details.    This uses a more efficient data structure and pagination for large number of markers.     Use GET when parameter size is less than 2K bytes. This method may support asynchronous processing.", response = AlleleMatrixValuesResponse1.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Marker Profiles","Deprecated", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AlleleMatrixValuesResponse1.class) })
    @RequestMapping(value = "/allelematrix-search",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<AlleleMatrixValuesResponse1> allelematrixSearchGet(@ApiParam(value = "The marker profile db ids. Not Required if 'markerDbId' or 'matrixDbId' is present.") @Valid @RequestParam(value = "markerprofileDbId", required = false) ArrayList<String> markerprofileDbId,@ApiParam(value = "ids of the markers. if none are specified, results are returned for all markers in the database. Not Required if 'markerprofileDbId' or 'matrixDbId' is present.") @Valid @RequestParam(value = "markerDbId", required = false) ArrayList<String> markerDbId,@ApiParam(value = "") @Valid @RequestParam(value = "matrixDbId", required = false) ArrayList<String> matrixDbId,@ApiParam(value = "format for the datafile to be downloaded. tsv and csv currently supported; flapjack may be supported.") @Valid @RequestParam(value = "format", required = false) String format,@ApiParam(value = "Should homozygotes NOT be collapsed into a single occurrence?") @Valid @RequestParam(value = "expandHomozygotes", required = false) Boolean expandHomozygotes,@ApiParam(value = "The string to use as a representation for missing data or the reserved word \"empty_string\".") @Valid @RequestParam(value = "unknownString", required = false) String unknownString,@ApiParam(value = "The string to use as a separator for phased allele calls or the reserved word \"empty_string\".") @Valid @RequestParam(value = "sepPhased", required = false) String sepPhased,@ApiParam(value = "The string to use as a separator for unphased allele calls or the reserved word \"empty_string\".") @Valid @RequestParam(value = "sepUnphased", required = false) String sepUnphased,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize) throws BrAPIServerException;


    @ApiOperation(value = "Scores through POST", nickname = "allelematrixSearchPost", notes = "Status: ACCEPTED.  Implemented by: Germinate (POST only), Cassavabase  Used by: Flapjack (POST only)  See Search Services for additional implementation details.  This uses a more efficient data structure and pagination for large number of markers.  Use POST when parameter size is greater than 2K bytes.  - If no format is specified, this call returns the data in JSON form.  - If a format (other than JSON) is specified and the server supports this format, it will return the link to the exported data file in the \"datafiles\" field of the \"metadata\".  - If more than one format is requested at a time, the server will throw a \"501 Not Implemented\" error.  The format of the tsv response can be found on GitHub (https://github.com/plantbreeding/Documentation/wiki/BrAPI-TSV-Expected-Formats)", response = AlleleMatrixValuesResponse1.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Marker Profiles","Deprecated", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AlleleMatrixValuesResponse1.class) })
    @RequestMapping(value = "/allelematrix-search",
        produces = { "application/json", "application/tsv" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<AlleleMatrixValuesResponse1> allelematrixSearchPost(@ApiParam(value = "The markerprofile db ids. Not Required if 'markerDbId' or 'matrixDbId' is present." ,required=true )  @Valid @RequestBody AlleleMatrixSearchRequest body) throws BrAPIServerException;

}
