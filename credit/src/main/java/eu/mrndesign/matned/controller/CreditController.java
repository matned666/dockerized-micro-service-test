package eu.mrndesign.matned.controller;


import dto.ProvidedDataDTO;
import eu.mrndesign.matned.dto.CreditDTO;
import eu.mrndesign.matned.service.CreditService;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
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
        ClientHttpRequestFactory requestFactory = new
                HttpComponentsClientHttpRequestFactory(HttpClients.createDefault());
        restTemplate.setRequestFactory(requestFactory);
    }

    @GetMapping
    public List<CreditDTO> showAllOrders(@RequestParam(defaultValue = "${default.sort.by}", name = "sort")
                                                     String[] sort,
                                         @RequestParam(defaultValue = "${default.page.start}", name = "page")
                                                 Integer page,
                                         @RequestParam(defaultValue = "${default.page.size}", name = "amount")
                                                     Integer amount) {
        return cS.findAllCredits(page, amount, sort);
    }

    @PostMapping("/save")
    public CreditDTO saveCredit(){
        return cS.saveCredit(new CreditDTO());
    }


    @PostMapping
    public ResponseEntity<ProvidedDataDTO> createCredit(@RequestBody ProvidedDataDTO data) throws ServerError {
        CreditDTO dto = cS.saveCredit(CreditDTO.createFromProvidedData(data));
        data.setCreditId(dto.getId());
        data.setCreditName(dto.getCreditName());
        return ResponseEntity.ok().body(restTemplate.postForObject(cS.url("product", productPort), data, ProvidedDataDTO.class));
    }

    @PostMapping("/product_resp")
    public ResponseEntity<ProvidedDataDTO> responseFromProduct(@RequestBody ProvidedDataDTO data) {
        return ResponseEntity.ok().body(restTemplate.postForObject(cS.url("client", clientPort), data, ProvidedDataDTO.class));
    }

    @GetMapping("/credit/{id}")
    public CreditDTO showCredit(@PathVariable Long id) throws ServerError {
        return cS.findCreditById(id);
    }

    @GetMapping("/{creditId}/client")
    public void showClientByCreditId(@PathVariable Long creditId,
                                     HttpServletResponse httpServletResponse) {
        String url = cS.url("client", clientPort)+"/"+creditId;
        httpServletResponse.setHeader("Location", url);
        httpServletResponse.setStatus(302);
    }

    @GetMapping("/{creditId}/product")
    public void showProductByCreditId(@PathVariable Long creditId,
                                     HttpServletResponse httpServletResponse) {
        String url = cS.url("product", productPort)+"/"+creditId;
        httpServletResponse.setHeader("Location", url);
        httpServletResponse.setStatus(302);    }

    @PostMapping("/client_resp")
    public ProvidedDataDTO showClientByCreditId(@RequestBody ProvidedDataDTO data) {
        return data;
    }

}


