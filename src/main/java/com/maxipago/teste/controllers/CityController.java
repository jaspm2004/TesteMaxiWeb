package com.maxipago.teste.controllers;

import com.maxipago.teste.services.CityService;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Jose San Pedro
 */
@Path("/city")
public class CityController {
    
    @Inject
    private CityService citySrv;

    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Response get(@QueryParam("format") String format) {
        if (format == null || format.isEmpty())
            return Response.status(Response.Status.BAD_REQUEST).entity("You need to specify a format (json/xml)").build();
        
        return Response
                .ok(citySrv.findAll(), "json".equals(format) ? MediaType.APPLICATION_JSON : MediaType.APPLICATION_XML)
                .build();
    }
    
    @GET
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    @Path("/distances")
    public Response service(@QueryParam("format") String format, @QueryParam("unit") String unit) {
        if (format == null || format.isEmpty())
            return Response.status(Response.Status.BAD_REQUEST).entity("You need to specify a format (json/xml)").build();
        
        if (unit == null || unit.isEmpty())
            return Response.status(Response.Status.BAD_REQUEST).entity("You need to specify a unit (km/mi)").build();
        
        return Response
                // Set the status, entity and media type of the response.
                .ok(citySrv.getDistances(unit), "json".equals(format) ? MediaType.APPLICATION_JSON : MediaType.APPLICATION_XML)
                .build();
    }
}
