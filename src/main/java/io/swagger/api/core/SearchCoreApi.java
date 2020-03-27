/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api.core;

import io.swagger.model.core.ListSearchRequest;
import io.swagger.model.core.ListsListResponse;
import io.swagger.model.core.LocationListResponse;
import io.swagger.model.core.LocationSearchRequest;
import io.swagger.model.common.Model202AcceptedSearchResponse;
import io.swagger.model.core.PersonListResponse;
import io.swagger.model.core.PersonSearchRequest;
import io.swagger.model.core.ProgramListResponse;
import io.swagger.model.core.ProgramSearchRequest;
import io.swagger.model.core.StudyListResponse;
import io.swagger.model.core.StudySearchRequest;
import io.swagger.model.core.TrialListResponse;
import io.swagger.model.core.TrialSearchRequest;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
@Api(value = "search", description = "the search API")
public interface SearchCoreApi {

	@ApiOperation(value = "Submit a search request for Programs", nickname = "searchProgramsPost", notes = "Advanced searching for the programs resource. See Search Services for additional implementation details.", response = ProgramListResponse.class, authorizations = {
			@Authorization(value = "AuthorizationToken") }, tags = { "Programs", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ProgramListResponse.class),
			@ApiResponse(code = 202, message = "Accepted", response = Model202AcceptedSearchResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = String.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = String.class),
			@ApiResponse(code = 403, message = "Forbidden", response = String.class) })
	@RequestMapping(value = "/search/programs", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<ProgramListResponse> searchProgramsPost(
			@ApiParam(value = "") @Valid @RequestBody ProgramSearchRequest body,
			@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>") @RequestHeader(value = "Authorization", required = false) String authorization);

	@ApiOperation(value = "Get the results of a Programs search request", nickname = "searchProgramsSearchResultsDbIdGet", notes = "Advanced searching for the programs resource. See Search Services for additional implementation details.", response = ProgramListResponse.class, authorizations = {
			@Authorization(value = "AuthorizationToken") }, tags = { "Programs", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = ProgramListResponse.class),
			@ApiResponse(code = 202, message = "Accepted", response = Model202AcceptedSearchResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = String.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = String.class),
			@ApiResponse(code = 403, message = "Forbidden", response = String.class),
			@ApiResponse(code = 404, message = "Not Found", response = String.class) })
	@RequestMapping(value = "/search/programs/{searchResultsDbId}", produces = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<ProgramListResponse> searchProgramsSearchResultsDbIdGet(
			@ApiParam(value = "Permanent unique identifier which references the search results", required = true) @PathVariable("searchResultsDbId") String searchResultsDbId,
			@ApiParam(value = "Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,
			@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,
			@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>") @RequestHeader(value = "Authorization", required = false) String authorization);

	@ApiOperation(value = "Submit a search request for Studies", nickname = "searchStudiesPost", notes = "Get list of studies StartDate and endDate should be ISO-8601 format for dates See Search Services for additional implementation details.", response = StudyListResponse.class, authorizations = {
			@Authorization(value = "AuthorizationToken") }, tags = { "Studies", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = StudyListResponse.class),
			@ApiResponse(code = 202, message = "Accepted", response = Model202AcceptedSearchResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = String.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = String.class),
			@ApiResponse(code = 403, message = "Forbidden", response = String.class) })
	@RequestMapping(value = "/search/studies", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<StudyListResponse> searchStudiesPost(
			@ApiParam(value = "Study Search request") @Valid @RequestBody StudySearchRequest body,
			@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>") @RequestHeader(value = "Authorization", required = false) String authorization);

	@ApiOperation(value = "Get the results of a Studies search request", nickname = "searchStudiesSearchResultsDbIdGet", notes = "Get list of studies  StartDate and endDate should be ISO-8601 format for dates  See Search Services for additional implementation details.", response = StudyListResponse.class, authorizations = {
			@Authorization(value = "AuthorizationToken") }, tags = { "Studies", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = StudyListResponse.class),
			@ApiResponse(code = 202, message = "Accepted", response = Model202AcceptedSearchResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = String.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = String.class),
			@ApiResponse(code = 403, message = "Forbidden", response = String.class),
			@ApiResponse(code = 404, message = "Not Found", response = String.class) })
	@RequestMapping(value = "/search/studies/{searchResultsDbId}", produces = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<StudyListResponse> searchStudiesSearchResultsDbIdGet(
			@ApiParam(value = "Permanent unique identifier which references the search results", required = true) @PathVariable("searchResultsDbId") String searchResultsDbId,
			@ApiParam(value = "Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,
			@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,
			@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>") @RequestHeader(value = "Authorization", required = false) String authorization);

	@ApiOperation(value = "Submit a search request for Trials", nickname = "searchTrialsPost", notes = "Advanced searching for the programs resource. See Search Services for additional implementation details.", response = TrialListResponse.class, authorizations = {
			@Authorization(value = "AuthorizationToken") }, tags = { "Trials", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = TrialListResponse.class),
			@ApiResponse(code = 202, message = "Accepted", response = Model202AcceptedSearchResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = String.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = String.class),
			@ApiResponse(code = 403, message = "Forbidden", response = String.class) })
	@RequestMapping(value = "/search/trials", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<TrialListResponse> searchTrialsPost(
			@ApiParam(value = "") @Valid @RequestBody TrialSearchRequest body,
			@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>") @RequestHeader(value = "Authorization", required = false) String authorization);

	@ApiOperation(value = "Get the results of a Trials search request", nickname = "searchTrialsSearchResultsDbIdGet", notes = "Advanced searching for the trials resource. See Search Services for additional implementation details.", response = TrialListResponse.class, authorizations = {
			@Authorization(value = "AuthorizationToken") }, tags = { "Trials", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = TrialListResponse.class),
			@ApiResponse(code = 202, message = "Accepted", response = Model202AcceptedSearchResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = String.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = String.class),
			@ApiResponse(code = 403, message = "Forbidden", response = String.class),
			@ApiResponse(code = 404, message = "Not Found", response = String.class) })
	@RequestMapping(value = "/search/trials/{searchResultsDbId}", produces = {
			"application/json" }, method = RequestMethod.GET)
	ResponseEntity<TrialListResponse> searchTrialsSearchResultsDbIdGet(
			@ApiParam(value = "Permanent unique identifier which references the search results", required = true) @PathVariable("searchResultsDbId") String searchResultsDbId,
			@ApiParam(value = "Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,
			@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,
			@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>") @RequestHeader(value = "Authorization", required = false) String authorization);

}
