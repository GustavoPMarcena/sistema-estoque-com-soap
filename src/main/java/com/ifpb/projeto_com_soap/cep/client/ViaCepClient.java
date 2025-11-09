package com.ifpb.projeto_com_soap.cep.client;

import com.ifpb.projeto_com_soap.cep.web.dto.AddressDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viaCepClient", url = "https://viacep.com.br/ws")
public interface ViaCepClient {

    @GetMapping("/{cep}/json/")
    AddressDto searchAddressPerCep(@PathVariable("cep") String cep);
}