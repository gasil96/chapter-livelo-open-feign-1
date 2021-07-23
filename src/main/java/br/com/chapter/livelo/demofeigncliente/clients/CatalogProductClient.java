package br.com.chapter.livelo.demofeigncliente.clients;

import br.com.chapter.livelo.demofeigncliente.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "${integration.catalago-produto.name}", url = "${integration.catalago-produto.url}")  //, configuration = FeignClientInterceptorGenericConfigure.class
public interface CatalogProductClient {

    @PostMapping("products")
    ProductDTO saveProduct(@RequestBody ProductDTO productDTO);

    @GetMapping("all-products")
    List<ProductDTO> allProducts();

}
