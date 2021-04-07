package eu.mrndesign.matned.controller;


import eu.mrndesign.matned.dto.ClientDTO;
import eu.mrndesign.matned.dto.CreditDTO;
import eu.mrndesign.matned.dto.ProductDTO;
import eu.mrndesign.matned.dto.ProvidedDataDTO;
import eu.mrndesign.matned.service.CreditService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.rmi.ServerError;
import java.util.List;

@RestController
public class CreditController {

    private final CreditService cS;
    private final Integer clientPort;
    private final Integer productPort;
    private final RestTemplate restTemplate;

    public CreditController(CreditService cS,
                            Integer clientPort,
                            Integer productPort,
                            RestTemplate restTemplate) {
        this.cS = cS;
        this.clientPort = clientPort;
        this.productPort = productPort;
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public List<CreditDTO> showAllOrders(@RequestParam(defaultValue = "${default.sort.by}", name = "sort")
                                                     String[] sort,
                                         @RequestParam(defaultValue = "${default.page.start}", name = "page")
                                                 Integer page,
                                         @RequestParam(defaultValue = "${default.page.size}", name = "amount")
                                                     Integer amount) throws ServerError {
        return cS.findAllCredits(page, amount, sort);
    }


    @PostMapping
    public ResponseEntity<ProductDTO> createCredit(@RequestBody ProvidedDataDTO data) throws ServerError {
        cS.saveCredit(CreditDTO.createFromProvidedData(data));
        return ResponseEntity.ok().body(restTemplate.postForObject(cS.url(productPort), data, ProductDTO.class));
    }

    @PostMapping("/product_resp")
    public ResponseEntity<ClientDTO> responseFromProduct(@RequestBody ProvidedDataDTO data) {
        return ResponseEntity.ok().body(restTemplate.postForObject(cS.url(clientPort), data, ClientDTO.class));
    }

    @GetMapping("/credit/{id}")
    public CreditDTO showCredit(@PathVariable Long id) throws ServerError {
        return cS.findCreditById(id);
    }



}


