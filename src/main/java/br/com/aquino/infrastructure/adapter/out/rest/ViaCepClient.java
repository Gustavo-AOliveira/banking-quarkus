package br.com.aquino.infrastructure.adapter.out.rest;

import br.com.aquino.infrastructure.adapter.out.rest.dto.response.ViaCepResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/ws")
@RegisterRestClient(configKey = "via-cep" )
public interface ViaCepClient {

    @GET
    @Path("/{cep}/json")
    @Produces(MediaType.APPLICATION_JSON)
    ViaCepResponse getEndereco(@PathParam("cep") String cep);
}
