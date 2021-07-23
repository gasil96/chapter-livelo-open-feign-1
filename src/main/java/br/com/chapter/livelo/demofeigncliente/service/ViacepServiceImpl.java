package br.com.chapter.livelo.demofeigncliente.service;

import br.com.chapter.livelo.demofeigncliente.clients.ViacepClient;
import br.com.chapter.livelo.demofeigncliente.dto.ViacepDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ViacepServiceImpl implements ViacepService {

    /**
     * Injeta o client como um repository
     */
    @Autowired
    private ViacepClient viacepClient;

    @Override
    public ViacepDTO getViaCep(String cep) {

        ViacepDTO viacepDTO = viacepClient.getViaCepInfo(cep);

        if (StringUtils.isBlank(viacepDTO.getComplemento())) {
            log.debug("Não há informações a respeito de complemento para o cep: {}", cep);
            viacepDTO.setComplemento("Sem nenhum complemento informado!");
        }
        return viacepDTO;
    }
}
