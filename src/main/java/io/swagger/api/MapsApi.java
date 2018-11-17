/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.0).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;
import org.brapi.test.BrAPITestServer.exceptions.BrAPIServerException;

import io.swagger.model.GenomeMapsResponse;
import io.swagger.model.MapDetailsResponse;
import io.swagger.model.MarkerSummaryLinkageGroupResponse;
import io.swagger.model.MarkerSummaryMapResponse;
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

@Api(value = "maps", description = "the maps API")
public interface MapsApi {

    @ApiOperation(value = "Get the Genomic Maps", nickname = "mapsGet", notes = "Get list of maps", response = GenomeMapsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Genome Maps", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GenomeMapsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class) })
    @RequestMapping(value = "/maps",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GenomeMapsResponse> mapsGet(@ApiParam(value = "DEPRECATED in v1.3 - See \"scientificName\"") @Valid @RequestParam(value = "species", required = false) String species,@ApiParam(value = "The common name of the crop, found from \"GET /commoncropnames\"") @Valid @RequestParam(value = "commonCropName", required = false) String commonCropName,@ApiParam(value = "Full scientific binomial format name. This includes Genus, Species, and Sub-species") @Valid @RequestParam(value = "scientificName", required = false) String scientificName,@ApiParam(value = "Type of map") @Valid @RequestParam(value = "type", required = false) String type,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the details of a specific Genomic Map", nickname = "mapsMapDbIdGet", notes = "Provides the number of markers on each linkageGroup and the max position on the linkageGroup", response = MapDetailsResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Genome Maps", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MapDetailsResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/maps/{mapDbId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<MapDetailsResponse> mapsMapDbIdGet(@ApiParam(value = "The internal db id of a selected map",required=true) @PathVariable("mapDbId") String mapDbId,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the positions of Markers inside a specific Genomic Map", nickname = "mapsMapDbIdPositionsGet", notes = "All the markers in a given Map, ordered by linkageGroup and position.", response = MarkerSummaryMapResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Genome Maps", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MarkerSummaryMapResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/maps/{mapDbId}/positions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<MarkerSummaryMapResponse> mapsMapDbIdPositionsGet(@ApiParam(value = "unique id of the map",required=true) @PathVariable("mapDbId") String mapDbId,@ApiParam(value = "Deprecated Use linkageGroupName instead") @Valid @RequestParam(value = "linkageGroupId", required = false) String linkageGroupId,@ApiParam(value = "The chromosome identifier or the generic linkage group identifier if the chromosome is not applicable.") @Valid @RequestParam(value = "linkageGroupName", required = false) String linkageGroupName,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;


    @ApiOperation(value = "Get the positions of Markers inside a specific Linkage Group", nickname = "mapsMapDbIdPositionsLinkageGroupNameGet", notes = "All the markers in a specific Linkage Group (aka Chromasome) inside a particular Map, ordered by position.", response = MarkerSummaryLinkageGroupResponse.class, authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Genome Maps", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MarkerSummaryLinkageGroupResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = String.class),
        @ApiResponse(code = 403, message = "Forbidden", response = String.class),
        @ApiResponse(code = 404, message = "Not Found", response = String.class) })
    @RequestMapping(value = "/maps/{mapDbId}/positions/{linkageGroupName}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<MarkerSummaryLinkageGroupResponse> mapsMapDbIdPositionsLinkageGroupNameGet(@ApiParam(value = "unique id of the map",required=true) @PathVariable("mapDbId") String mapDbId,@ApiParam(value = "The chromosome identifier or the generic linkage group identifier if the chromosome is not applicable.",required=true) @PathVariable("linkageGroupName") String linkageGroupName,@ApiParam(value = "minimum position on linkage group") @Valid @RequestParam(value = "min", required = false) Integer min,@ApiParam(value = "maximum position on linkage group") @Valid @RequestParam(value = "max", required = false) Integer max,@ApiParam(value = "Which result page is requested. The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong>Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization) throws BrAPIServerException;

}
