package com.maxipago.teste.controllers;

import com.maxipago.teste.services.CityService;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Jose San Pedro
 */
@Path("/city")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class CityController {
    
    @Inject
    private CityService citySrv;

    @GET
    public Response get() {
        return Response.ok().entity(citySrv.findAll()).build();
    }
    
    @GET
    @Path("/distances/{unit}/{format}")
    public Response distances(@PathParam("unit") String unit
                            , @PathParam("format") String format) {
        
        return Response.ok().entity(citySrv.getDistances(unit)).build();
    }
}
