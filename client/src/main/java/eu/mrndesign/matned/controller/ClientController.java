package eu.mrndesign.matned.controller;

import dto.ProvidedDataDTO;
import eu.mrndesign.matned.dto.ClientDTO;
import eu.mrndesign.matned.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.rmi.ServerError;

@RestController
public class ClientController {

    private final ClientService cS;

    public ClientController(ClientService cS) {
        this.cS = cS;
    }

    @PostMapping
    public void saveClientAndBackToCredit(@RequestBody ProvidedDataDTO data) throws ServerError {
        cS.saveClient(ClientDTO.createFromProvidedData(data));
    }

    @GetMapping("/{creditId}")
    public ClientDTO showClientByCreditId(@PathVariable Long creditId) throws ServerError {
        return cS.findClientByCreditId(creditId);
    }

}
