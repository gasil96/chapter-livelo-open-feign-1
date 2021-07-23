package br.com.chapter.livelo.demofeigncliente.service;

import br.com.chapter.livelo.demofeigncliente.dto.ViacepDTO;

public interface ViacepService {

    ViacepDTO getViaCep(String cep);

}
