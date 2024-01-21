package com.codevup.quarkus.demo;

import com.codevup.quarkus.demo.request.GreetingRequest;
import com.codevup.quarkus.demo.response.GreetingResponse;
import com.codevup.quarkus.demo.service.GreetingService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService greetingService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public GreetingResponse hello(@QueryParam("name") String name) {
        return new GreetingResponse(greetingService.greet(name));
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createGreeting(GreetingRequest greetingRequest) {
        // Implementation to create a greeting
        return Response.ok().build();
    }

    @DELETE
    @Consumes(MediaType.TEXT_PLAIN)
    public Response deleteGreeting(String name) {
        // Implementation to delete a greeting
        return Response.ok().build();
    }

    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public Response updateGreeting(String name) {
        // Implementation to update a greeting
        return Response.ok().build();
    }
}
