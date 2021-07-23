package br.com.chapter.livelo.demofeigncliente.clients;

import br.com.chapter.livelo.demofeigncliente.dto.ViacepDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${integration.viacep.name}", url = "${integration.viacep.url}")
public interface ViacepClient {

    @GetMapping("/ws/{cep}/json/")
    ViacepDTO getViaCepInfo(@PathVariable("cep") String cep);

}
