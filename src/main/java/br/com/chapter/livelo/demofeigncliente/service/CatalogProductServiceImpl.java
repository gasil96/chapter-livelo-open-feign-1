package br.com.chapter.livelo.demofeigncliente.service;

import br.com.chapter.livelo.demofeigncliente.clients.CatalogProductClient;
import br.com.chapter.livelo.demofeigncliente.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogProductServiceImpl implements CatalogProductService {

    @Autowired
    private CatalogProductClient catalogProductClient;

    @Override
    public ProductDTO saveProduct(ProductDTO productDTO) {
        return catalogProductClient.saveProduct(productDTO);
    }

    @Override
    public List<ProductDTO> allProducts() {
        return catalogProductClient.allProducts();
    }
}
