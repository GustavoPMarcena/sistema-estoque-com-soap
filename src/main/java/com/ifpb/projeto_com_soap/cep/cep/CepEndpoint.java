package com.ifpb.projeto_com_soap.cep.cep;

import com.ifpb.projeto_com_soap.cep.Endereco;
import com.ifpb.projeto_com_soap.cep.GetCepRequest;
import com.ifpb.projeto_com_soap.cep.GetCepResponse;
import com.ifpb.projeto_com_soap.cep.client.ViaCepClient;
import com.ifpb.projeto_com_soap.cep.web.dto.AddressDto;
import com.ifpb.projeto_com_soap.cep.web.dto.AdressMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CepEndpoint {

    private static final String NAMESPACE_URI = "http://ifpb.com/projeto_com_soap/cep";

    private final ViaCepClient viaCepClient;

    @Autowired
    public CepEndpoint(ViaCepClient viaCepClient, ModelMapper modelMapper) {
        this.viaCepClient = viaCepClient;

    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCepRequest")
    @ResponsePayload
    public GetCepResponse getCep(@RequestPayload GetCepRequest request) {
        AddressDto viaCep = viaCepClient.searchAddressPerCep(request.getCep());
        GetCepResponse response = new GetCepResponse();

        Endereco endereco = AdressMapper.toEndereco(viaCep);

        response.setEndereco(endereco);
        return response;
    }
}
