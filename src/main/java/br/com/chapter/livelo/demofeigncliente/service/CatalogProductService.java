package br.com.chapter.livelo.demofeigncliente.service;

import br.com.chapter.livelo.demofeigncliente.dto.ProductDTO;

import java.util.List;

public interface CatalogProductService {

    ProductDTO saveProduct(ProductDTO productDTO);

    List<ProductDTO> allProducts();

}
