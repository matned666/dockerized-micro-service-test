package eu.mrndesign.matned.controller;

import eu.mrndesign.matned.dto.ClientDTO;
import eu.mrndesign.matned.dto.ProvidedDataDTO;
import eu.mrndesign.matned.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;
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
    }

    @GetMapping
    public List<ClientDTO> showAllOrders(@RequestParam(defaultValue = "${default.sort.by}", name = "sort") String[] sort,
                                         @RequestParam(defaultValue = "${default.page.start}", name = "page") Integer page,
                                         @RequestParam(defaultValue = "${default.page.size}", name = "amount") Integer amount) throws ServerError {
        return cS.findAllClients(page, amount, sort);
    }

    @PostMapping
    public void saveClientAndBackToCredit(@RequestBody ProvidedDataDTO data,
                                          HttpServletResponse httpServletResponse) throws ServerError {
        cS.saveClient(ClientDTO.createFromProvidedData(data));
        String url = cS.url(creditPort)+"/credit/"+data.getCreditId();
        httpServletResponse.setHeader("Location", url);
        httpServletResponse.setStatus(302);
    }

    @GetMapping("/{creditId}")
    public ClientDTO showClientByCreditId(@PathVariable Long creditId) throws ServerError {
        return cS.findClientByCreditId(creditId);
    }








}
