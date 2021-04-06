package eu.mrndesign.matned.controller;

import eu.mrndesign.matned.dto.CreditDTO;
import eu.mrndesign.matned.service.CreditService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerError;
import java.util.List;

@RestController
public class CreditController {

    private final CreditService creditService;

    public CreditController(CreditService creditService) {
        this.creditService = creditService;
    }

    @GetMapping
    public List<CreditDTO> showAllOrders(@RequestParam(defaultValue = "${default.sort.by}", name = "sort") String[] sort,
                                         @RequestParam(defaultValue = "${default.page.start}", name = "page") Integer page,
                                         @RequestParam(defaultValue = "${default.page.size}", name = "amount") Integer amount) throws ServerError {
        return creditService.findAllCredits(page, amount, sort);
    }

}
