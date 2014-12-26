/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.se.closestofferfinder.service.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
/**
 *
 * @author fil
 */
@Provider
public class DefaultExceptionHandler implements ExceptionMapper<Exception> {


    @Override
    public Response toResponse(Exception e) {        
        // For simplicity I am preparing error xml by hand.
        // Ideally we should create an ErrorResponse class to hold the error info.
        StringBuilder response = new StringBuilder("{\"response\":{");
        response.append("\"status\":\"ERROR\""+",");
        response.append("\"message\":\"" + e.getMessage());
        response.append("\"}}");
        return Response.serverError().entity(response.toString()).type(MediaType.APPLICATION_JSON).build();
    }
}
