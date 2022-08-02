package com.kcbgroup.main.soap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.kcbgroup.main.entities.CourseDetails;
import com.kcbgroup.main.entities.GetCourseDetailsRequest;
import com.kcbgroup.main.entities.GetCourseDetailsResponse;
import com.kcbgroup.main.service.impl.CourseDetailsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * @ Author NMuchiri
 **/
@Endpoint
@Slf4j
@RequiredArgsConstructor
public class CourseDetailsEndpoint {
    /*                      GLOBAL VARIABLES                 */

    final CourseDetailsService service;

    /* Set payload root by giving the namespace and element name defined in the xsd*/
    @PayloadRoot(namespace = "http://in28minutes.com/courses", localPart = "GetCourseDetailsRequest")
    @ResponsePayload
    public GetCourseDetailsResponse
    processCourseDetailsRequest(@RequestPayload GetCourseDetailsRequest request) {
        GetCourseDetailsResponse response = new GetCourseDetailsResponse();
        CourseDetails courseDetails = new CourseDetails();

        // Request id
        log.info("ID -> {}", request.getId());

        courseDetails.setId(request.getId());
        courseDetails.setName("Computer Science");
        courseDetails.setDescription("This is the only course you will need");
        response.setCourseDetails(courseDetails);


        /*  Object to json converter */
        //Course Details
        try {
            ObjectWriter course = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String logCourse = course.writeValueAsString(courseDetails);
            log.info("Course Details: {}", logCourse);
        } catch (JsonProcessingException e) {
            String errorMessage = e.getMessage();
            log.error("Request Error: {}", errorMessage);
        }


        /*  Object to json converter */
        //Expected response
        try {
            ObjectWriter resp = new ObjectMapper().writer().withDefaultPrettyPrinter();
            String logResp = resp.writeValueAsString(response);
            log.info("Response: {}", logResp);

        } catch (JsonProcessingException e) {
            String errorMessage = e.getMessage();
            log.error("Response Error: {}", errorMessage);
        }

        return response;
    }
}
