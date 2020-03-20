/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api.core;

import io.swagger.model.core.PersonListResponse;
import io.swagger.model.core.PersonNewRequest;
import io.swagger.model.core.PersonSingleResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:31:52.030Z[GMT]")
@Api(value = "people", description = "the people API")
public interface PeopleApi {

	@ApiOperation(value = "Get filtered list of People", nickname = "peopleGet", notes = "Get filtered list of people", response = PersonListResponse.class, authorizations = {
			@Authorization(value = "AuthorizationToken") }, tags = { "People", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = PersonListResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = String.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = String.class),
			@ApiResponse(code = 403, message = "Forbidden", response = String.class) })
	@RequestMapping(value = "/people", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<PersonListResponse> peopleGet(
			@ApiParam(value = "A persons first name") @Valid @RequestParam(value = "firstName", required = false) String firstName,
			@ApiParam(value = "A persons last name") @Valid @RequestParam(value = "lastName", required = false) String lastName,
			@ApiParam(value = "The unique ID of a person") @Valid @RequestParam(value = "personDbId", required = false) String personDbId,
			@ApiParam(value = "A systems user ID associated with this person. Different from personDbId because you could have a person who is not a user of the system.") @Valid @RequestParam(value = "userID", required = false) String userID,
			@ApiParam(value = "Search for Germplasm by an external reference") @Valid @RequestParam(value = "externalReferenceID", required = false) String externalReferenceID,
			@ApiParam(value = "Search for Germplasm by an external reference") @Valid @RequestParam(value = "externalReferenceSource", required = false) String externalReferenceSource,
			@ApiParam(value = "Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page,
			@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,
			@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>") @RequestHeader(value = "Authorization", required = false) String authorization);

	@ApiOperation(value = "Get the details for a specific Person", nickname = "peoplePersonDbIdGet", notes = "Get the details for a specific Person", response = PersonSingleResponse.class, authorizations = {
			@Authorization(value = "AuthorizationToken") }, tags = { "People", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = PersonSingleResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = String.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = String.class),
			@ApiResponse(code = 403, message = "Forbidden", response = String.class),
			@ApiResponse(code = 404, message = "Not Found", response = String.class) })
	@RequestMapping(value = "/people/{personDbId}", produces = { "application/json" }, method = RequestMethod.GET)
	ResponseEntity<PersonSingleResponse> peoplePersonDbIdGet(
			@ApiParam(value = "The unique ID of a person", required = true) @PathVariable("personDbId") String personDbId,
			@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>") @RequestHeader(value = "Authorization", required = false) String authorization);

	@ApiOperation(value = "Update an existing Person", nickname = "peoplePersonDbIdPut", notes = "Update an existing Person", response = PersonSingleResponse.class, authorizations = {
			@Authorization(value = "AuthorizationToken") }, tags = { "People", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = PersonSingleResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = String.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = String.class),
			@ApiResponse(code = 403, message = "Forbidden", response = String.class),
			@ApiResponse(code = 404, message = "Not Found", response = String.class) })
	@RequestMapping(value = "/people/{personDbId}", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.PUT)
	ResponseEntity<PersonSingleResponse> peoplePersonDbIdPut(
			@ApiParam(value = "The unique ID of a person", required = true) @PathVariable("personDbId") String personDbId,
			@ApiParam(value = "") @Valid @RequestBody PersonNewRequest body,
			@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>") @RequestHeader(value = "Authorization", required = false) String authorization);

	@ApiOperation(value = "Create new People", nickname = "peoplePost", notes = "Create new People entities. `personDbId` is generated and managed by the server.", response = PersonListResponse.class, authorizations = {
			@Authorization(value = "AuthorizationToken") }, tags = { "People", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = PersonListResponse.class),
			@ApiResponse(code = 400, message = "Bad Request", response = String.class),
			@ApiResponse(code = 401, message = "Unauthorized", response = String.class),
			@ApiResponse(code = 403, message = "Forbidden", response = String.class) })
	@RequestMapping(value = "/people", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	ResponseEntity<PersonListResponse> peoplePost(@ApiParam(value = "") @Valid @RequestBody List<PersonNewRequest> body,
			@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>") @RequestHeader(value = "Authorization", required = false) String authorization);

}
