package br.com.chapter.livelo.demofeigncliente.controllers;

import br.com.chapter.livelo.demofeigncliente.dto.ProductDTO;
import br.com.chapter.livelo.demofeigncliente.dto.ViacepDTO;
import br.com.chapter.livelo.demofeigncliente.service.CatalogProductService;
import br.com.chapter.livelo.demofeigncliente.service.ViacepService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Central Controller")
public class HomeController {

    @Autowired
    private ViacepService viacepService;

    @Autowired
    private CatalogProductService catalogProductService;

    /**
     * Api publica viacep
     */
    @Operation(summary = "search the 'cep' information")
    @GetMapping("address")
    public ResponseEntity<ViacepDTO> getAddress(@RequestParam("cep") String cep) {
        return ResponseEntity.ok(viacepService.getViaCep(cep));
    }

    /**
     * Api local de produto
     */
    @Operation(summary = "save product in API catalog")
    @PostMapping("save-product")
    public ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO productDTO) {
        return ResponseEntity.ok(catalogProductService.saveProduct(productDTO));
    }

    @Operation(summary = "all products in API catalog (protected)")
    @GetMapping("products")
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        return ResponseEntity.ok(catalogProductService.allProducts());
    }

}
