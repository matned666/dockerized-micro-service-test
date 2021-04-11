package eu.mrndesign.matned.controller;

import eu.mrndesign.matned.dto.ProvidedDataDTO;
import eu.mrndesign.matned.dto.CreditDTO;
import eu.mrndesign.matned.service.CreditService;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.rmi.ServerError;
import java.util.List;

@RestController
public class CreditController {

    private final CreditService cS;
    private final Integer clientPort;
    private final Integer creditPort;
    private final Integer productPort;
    private final RestTemplate restTemplate;

    public CreditController(CreditService cS,
                            Integer clientPort,
                            Integer creditPort,
                            Integer productPort,
                            RestTemplate restTemplate) {
        this.cS = cS;
        this.clientPort = clientPort;
        this.creditPort = creditPort;
        this.productPort = productPort;
        this.restTemplate = restTemplate;
        ClientHttpRequestFactory requestFactory = new
                HttpComponentsClientHttpRequestFactory(HttpClients.createDefault());
        restTemplate.setRequestFactory(requestFactory);
    }

    @GetMapping
    public List<ReceivedData> getCredits(@RequestParam(defaultValue = "${default.sort.by}", name = "sort")
                                                     String[] sort,
                                         @RequestParam(defaultValue = "${default.page.start}", name = "page")
                                                 Integer page,
                                         @RequestParam(defaultValue = "${default.page.size}", name = "amount")
                                                     Integer amount) {
        List<ReceivedData> creditList = cS.findAllCredits(page, amount, sort);
        cS.addProductData(creditList, productPort);
        cS.addClientData(creditList, clientPort);
        return creditList;
    }

    @PostMapping
    public ReceivedData createCredit(@Valid @RequestBody ProvidedDataDTO data) throws ServerError {
        CreditDTO dto = cS.saveCredit(CreditDTO.createFromProvidedData(data));
        data.setCreditId(dto.getId());
        data.setCreditName(dto.getCreditName());
        restTemplate.postForObject(cS.url("product", productPort), data, ProvidedDataDTO.class);
        restTemplate.postForObject(cS.url("client", clientPort), data, ProvidedDataDTO.class);
        return restTemplate.getForObject(cS.url("credit", creditPort)+"/credit/credit_response/"+dto.getId(), ReceivedData.class);

    }

    @GetMapping("/credit/credit_response/{id}")
    public ReceivedData showCreatedCredit(@PathVariable Long id) throws ServerError {
        return cS.getCreatedCredit(id, productPort, clientPort);
    }


    @GetMapping("/{creditId}/client")
    public void showClientByCreditId(@PathVariable Long creditId,
                                     HttpServletResponse httpServletResponse){
        String url = cS.url("client", clientPort)+"/"+creditId;
        httpServletResponse.setHeader("Location", url);
        httpServletResponse.setStatus(302);
    }

    @GetMapping("/{creditId}/product")
    public void showProductByCreditId(@PathVariable Long creditId,
                                     HttpServletResponse httpServletResponse){
        String url = cS.url("product", productPort)+"/"+creditId;
        httpServletResponse.setHeader("Location", url);
        httpServletResponse.setStatus(302);    }


}


