package org.brapi.test.BrAPITestServer.controller.pheno;

import io.swagger.model.pheno.ObservationLevelListResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.api.pheno.ObservationlevelsApi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-20T16:32:22.556Z[GMT]")
@Controller
public class ObservationlevelsApiController implements ObservationlevelsApi {

    private static final Logger log = LoggerFactory.getLogger(ObservationlevelsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ObservationlevelsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ObservationLevelListResponse> observationlevelsGet(@ApiParam(value = "Filter by study DbId") @Valid @RequestParam(value = "studyDbId", required = false) String studyDbId
,@ApiParam(value = "Filter by trial DbId") @Valid @RequestParam(value = "trialDbId", required = false) String trialDbId
,@ApiParam(value = "Filter by program DbId") @Valid @RequestParam(value = "programDbId", required = false) String programDbId
,@ApiParam(value = "Used to request a specific page of data to be returned.  The page indexing starts at 0 (the first page is 'page'= 0). Default is `0`.") @Valid @RequestParam(value = "page", required = false) Integer page
,@ApiParam(value = "The size of the pages to be returned. Default is `1000`.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize
,@ApiParam(value = "HTTP HEADER - Token used for Authorization   <strong> Bearer {token_string} </strong>" ) @RequestHeader(value="Authorization", required=false) String authorization
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ObservationLevelListResponse>(objectMapper.readValue("{\n  \"result\" : {\n    \"data\" : [ {\n      \"levelName\" : \"field\",\n      \"levelOrder\" : 0\n    }, {\n      \"levelName\" : \"block\",\n      \"levelOrder\" : 1\n    }, {\n      \"levelName\" : \"plot\",\n      \"levelOrder\" : 2\n    }, {\n      \"levelName\" : \"sub-plot\",\n      \"levelOrder\" : 3\n    }, {\n      \"levelName\" : \"plant\",\n      \"levelOrder\" : 4\n    } ]\n  },\n  \"metadata\" : \"\",\n  \"@context\" : [ \"https://brapi.org/jsonld/context/metadata.jsonld\" ]\n}", ObservationLevelListResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ObservationLevelListResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ObservationLevelListResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
