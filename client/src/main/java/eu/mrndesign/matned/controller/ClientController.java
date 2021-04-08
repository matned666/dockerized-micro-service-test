package eu.mrndesign.matned.controller;

import eu.mrndesign.matned.dto.ClientDTO;
import eu.mrndesign.matned.dto.ProvidedDataDTO;
import eu.mrndesign.matned.service.ClientService;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.rmi.ServerError;
import java.util.List;

@RestController
public class ClientController {

    private final ClientService cS;
    private final Integer creditPort;
    private final RestTemplate restTemplate;

    public ClientController(ClientService cS,
                            Integer creditPort,
                            RestTemplate restTemplate) {
        this.cS = cS;
        this.creditPort = creditPort;
        this.restTemplate = restTemplate;
        ClientHttpRequestFactory requestFactory = new
                HttpComponentsClientHttpRequestFactory(HttpClients.createDefault());
        restTemplate.setRequestFactory(requestFactory);
    }

    @GetMapping
    public List<ClientDTO> showAllOrders(@RequestParam(defaultValue = "${default.sort.by}", name = "sort") String[] sort,
                                         @RequestParam(defaultValue = "${default.page.start}", name = "page") Integer page,
                                         @RequestParam(defaultValue = "${default.page.size}", name = "amount") Integer amount) throws ServerError {
        return cS.findAllClients(page, amount, sort);
    }

    @PostMapping
    public ResponseEntity<ProvidedDataDTO> saveClientAndBackToCredit(@RequestBody ProvidedDataDTO data) throws ServerError {
        cS.saveClient(ClientDTO.createFromProvidedData(data));
        return ResponseEntity.ok().body(restTemplate.postForObject(cS.url("credit", creditPort)+"/client_resp", data, ProvidedDataDTO.class));
    }

    @GetMapping("/{creditId}")
    public ClientDTO showClientByCreditId(@PathVariable Long creditId) throws ServerError {
        return cS.findClientByCreditId(creditId);
    }








}
