package com.ifpb.projeto_com_soap.cep.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor @ToString
public class AddressDto {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
}
