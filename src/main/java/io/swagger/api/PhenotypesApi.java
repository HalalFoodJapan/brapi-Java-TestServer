/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.0).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;
import org.brapi.test.BrAPITestServer.exceptions.BrAPIServerException;

import io.swagger.model.NewObservationDbIdsResponse;
import io.swagger.model.PhenotypesRequest;
import io.swagger.model.WSMIMEDataTypes;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T14:32:54.779-05:00[America/New_York]")

@Api(value = "phenotypes", description = "the phenotypes API")
public interface PhenotypesApi {

    @ApiOperation(value = "Add new Observation Unit Phenotypes", nickname = "phenotypesPost", notes = "Notes:   Along with the study specific phenotype saving calls (in the observationUnit and table formats), this call allows phenotypes to be saved and images to optionally be transferred as well.  Call to invoke for saving the measurements (observations) collected\\nfrom field for all the observation units.  Observation timestamp should be ISO 8601 https://www.w3.org/TR/NOTE-datetime   In case where JSON data is zipped for faster transfer speed (as in the case of the IRRI handheld implementation), the zipped JSON file will be listed in datafiles. The zipped file contains a JSON file with the same structure as the BrAPI call. In this case a format parameter should be passed as well.   Images can be optionally be uploaded using this call by providing a zipfile of all images in the datafiles, along with the actual zipfile in multi-part form data.\"", response = NewObservationDbIdsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Phenotypes","Observations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NewObservationDbIdsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = "/phenotypes",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<NewObservationDbIdsResponse> phenotypesPost(@ApiParam(value = ""  )  @Valid @RequestBody PhenotypesRequest body,@ApiParam(value = "In case where JSON data is zipped for faster transfer speed (as in the case of the IRRI handheld implementation), the zipped JSON file will be listed in datafiles. The zipped file contains a JSON file with the same structure as the BrAPI call.") @Valid @RequestParam(value = "format", required = false) WSMIMEDataTypes format,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;

}