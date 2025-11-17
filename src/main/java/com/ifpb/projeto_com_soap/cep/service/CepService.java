package com.ifpb.projeto_com_soap.cep.service;

import com.ifpb.projeto_com_soap.cep.model.Endereco;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService(
        targetNamespace = "http://ifpb.com/projeto_com_soap/cep",
        name = "CepService"
)
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CepService {

    @WebMethod
    @WebResult(name = "endereco")
    Endereco getCep(@WebParam(name = "cep") String cep);
}
