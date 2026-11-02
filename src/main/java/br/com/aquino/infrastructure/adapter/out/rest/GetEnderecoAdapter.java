package br.com.aquino.infrastructure.adapter.out.rest;

import br.com.aquino.application.core.domain.Endereco;
import br.com.aquino.application.port.out.GetEnderecoOutputPort;
import br.com.aquino.infrastructure.mapper.EnderecoMapper;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.logging.Logger;

@ApplicationScoped
public class GetEnderecoAdapter implements GetEnderecoOutputPort {


    private static final Logger log = Logger.getLogger(GetEnderecoAdapter.class.getName());

    private final ViaCepClient viaCepClient;
    private final EnderecoMapper mapper;

    public GetEnderecoAdapter(@RestClient ViaCepClient viaCepClient, EnderecoMapper mapper) {
        this.viaCepClient = viaCepClient;
        this.mapper = mapper;
    }

    @Override
    public Endereco get(String cep) {
        log.info("teste");
        return mapper.toDomain(viaCepClient.getEndereco(cep));
    }
}
