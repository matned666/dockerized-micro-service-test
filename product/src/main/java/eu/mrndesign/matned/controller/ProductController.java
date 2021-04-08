package eu.mrndesign.matned.controller;

import dto.ProvidedDataDTO;
import eu.mrndesign.matned.dto.ProductDTO;
import eu.mrndesign.matned.service.ProductService;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
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
        ClientHttpRequestFactory requestFactory = new
                HttpComponentsClientHttpRequestFactory(HttpClients.createDefault());
        restTemplate.setRequestFactory(requestFactory);
    }

    @GetMapping
    public List<ProductDTO> showAllOrders(@RequestParam(defaultValue = "${default.sort.by}", name = "sort")
                                                      String[] sort,
                                          @RequestParam(defaultValue = "${default.page.start}", name = "page")
                                                  Integer page,
                                          @RequestParam(defaultValue = "${default.page.size}", name = "amount")
                                                      Integer amount) {
        return pS.findAllProducts(page, amount, sort);
    }

    @PostMapping
    public ResponseEntity<ProvidedDataDTO> createCredit(@RequestBody ProvidedDataDTO data) throws ServerError {
        pS.saveProduct(ProductDTO.createFromProvidedData(data));
        return ResponseEntity.ok().body(restTemplate.postForObject(pS.url("credit", creditPort)+"/product_resp", data, ProvidedDataDTO.class));
    }

    @GetMapping("/{creditId}")
    public ProductDTO showProductByCreditId(@PathVariable Long creditId) throws ServerError {
        return pS.findProductByCreditId(creditId);
    }



}
