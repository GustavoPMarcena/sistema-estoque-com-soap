package com.ifpb.projeto_com_soap.cep.web.dto;

import com.ifpb.projeto_com_soap.cep.model.Endereco;
import org.modelmapper.ModelMapper;

public class AdressMapper {
    public static Endereco toEndereco (AddressDto enderecoDto) {
        return new ModelMapper().map(enderecoDto, Endereco.class);
    }
}
