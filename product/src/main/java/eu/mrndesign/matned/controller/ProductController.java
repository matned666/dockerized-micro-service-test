package eu.mrndesign.matned.controller;

import eu.mrndesign.matned.dto.ProductDTO;
import eu.mrndesign.matned.dto.ProvidedDataDTO;
import eu.mrndesign.matned.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.rmi.ServerError;
import java.util.List;

@RestController
public class ProductController {

    private final ProductService pS;
    private final Integer creditPort;
    private final RestTemplate restTemplate;


    public ProductController(ProductService pS,
                             Integer creditPort,
                             RestTemplate restTemplate) {
        this.pS = pS;
        this.creditPort = creditPort;
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public List<ProductDTO> showAllOrders(@RequestParam(defaultValue = "${default.sort.by}", name = "sort")
                                                      String[] sort,
                                          @RequestParam(defaultValue = "${default.page.start}", name = "page")
                                                  Integer page,
                                          @RequestParam(defaultValue = "${default.page.size}", name = "amount")
                                                      Integer amount) throws ServerError {
        return pS.findAllProducts(page, amount, sort);
    }

    @PostMapping
    public ResponseEntity<ProvidedDataDTO> createCredit(@RequestBody ProvidedDataDTO data) throws ServerError {
        pS.saveProduct(ProductDTO.createFromProvidedData(data));
        return ResponseEntity.ok().body(restTemplate.postForObject(pS.url(creditPort)+"/product_resp", data, ProvidedDataDTO.class));
    }

    @GetMapping("/{creditId}")
    public ProductDTO showProductByCreditId(@PathVariable Long creditId) throws ServerError {
        return pS.findProductByCreditId(creditId);
    }



}
