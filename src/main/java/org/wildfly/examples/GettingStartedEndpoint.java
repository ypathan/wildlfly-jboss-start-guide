package org.wildfly.examples;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/books")
public class GettingStartedEndpoint {

    @Inject
    Repo repo;

    @GET
    @Path("/new")
    @Produces(MediaType.APPLICATION_JSON)
    public Response newBook() {

        Book b = new Book();
        b.setAuthor("yousuf");
        b.setBookName("my book");
        repo.save(b);

        return Response.ok(b).build();
    }
}
