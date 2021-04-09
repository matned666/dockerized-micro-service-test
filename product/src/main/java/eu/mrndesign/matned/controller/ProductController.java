package eu.mrndesign.matned.controller;

import dto.ProvidedDataDTO;
import eu.mrndesign.matned.dto.ProductDTO;
import eu.mrndesign.matned.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerError;

@RestController
public class ProductController {

    private final ProductService pS;



    public ProductController(ProductService pS) {
        this.pS = pS;
    }

    @PostMapping
    public void createCredit(@RequestBody ProvidedDataDTO data) throws ServerError {
        pS.saveProduct(ProductDTO.createFromProvidedData(data));
    }

    @GetMapping("/{creditId}")
    public ProductDTO showProductByCreditId(@PathVariable Long creditId) throws ServerError {
        return pS.findProductByCreditId(creditId);
    }


}
