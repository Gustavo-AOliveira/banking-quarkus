package br.com.aquino.application.port.out;

import br.com.aquino.application.core.domain.Endereco;

public interface GetEnderecoOutputPort {

    Endereco get(String cep);
}
