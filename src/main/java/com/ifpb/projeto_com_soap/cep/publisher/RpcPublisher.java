package com.ifpb.projeto_com_soap.cep.publisher;

import com.ifpb.projeto_com_soap.cep.service.CepServiceImpl;
import jakarta.xml.ws.Endpoint;


public class RpcPublisher {
    public static void main(String[] args) {
        CepServiceImpl service = new CepServiceImpl();
        Endpoint.publish("http://localhost:8080/cep-service", service);
        System.out.println("Endpoint: http://localhost:8080/cep-service");
    }
}