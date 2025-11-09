package com.ifpb.projeto_com_soap.cep.service;

import com.ifpb.projeto_com_soap.cep.Endereco;
import com.ifpb.projeto_com_soap.cep.web.dto.AddressDto;
import com.ifpb.projeto_com_soap.cep.web.dto.AdressMapper;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import org.springframework.web.client.RestTemplate;

@WebService(endpointInterface = "com.ifpb.projeto_com_soap.cep.service.CepService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class CepServiceImpl implements CepService {

    @Override
    public Endereco getCep(String cep) {
        Endereco endereco = new Endereco();
        try {
            String url = "https://viacep.com.br/ws/" + cep + "/json/";
            RestTemplate restTemplate = new RestTemplate();
            AddressDto dto = restTemplate.getForObject(url, AddressDto.class);

            if (dto != null) {
                endereco = AdressMapper.toEndereco(dto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return endereco;
    }
}