package com.ifpb.projeto_com_soap.cep.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor @ToString
public class AddressDto {
    @JsonProperty("cep")
    private String cep;

    @JsonProperty("logradouro")
    private String logradouro;

    @JsonProperty("complemento")
    private String complemento;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("localidade")
    private String localidade;

    @JsonProperty("uf")
    private String uf;
}
