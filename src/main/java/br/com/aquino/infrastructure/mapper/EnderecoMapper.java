package br.com.aquino.infrastructure.mapper;

import br.com.aquino.application.core.domain.Endereco;
import br.com.aquino.infrastructure.adapter.out.rest.dto.response.ViaCepResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.CDI)
public interface EnderecoMapper {

    Endereco toDomain(ViaCepResponse dto);
}
