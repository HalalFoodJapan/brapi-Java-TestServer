/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.0).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;
import org.brapi.test.BrAPITestServer.exceptions.BrAPIServerException;

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

@Api(value = "logout", description = "the logout API")
public interface LogoutApi {

    @ApiOperation(value = "Logout", nickname = "logoutDelete", notes = "Implemented by: Tripal Brapi module, Cassavabase, Germinate, BMS  Used by: Flapjack, BMS  For logout, returns an empty resource. A token to remove could be provided (amdin interface) but it is not required. By default, current user token will be removed.", authorizations = {
        @Authorization(value = "AuthorizationToken")
    }, tags={ "Authentication","Deprecated", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created") })
    @RequestMapping(value = "/logout",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<String> logoutDelete() throws BrAPIServerException;

}
