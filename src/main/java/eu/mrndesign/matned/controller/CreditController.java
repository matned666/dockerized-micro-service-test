package eu.mrndesign.matned.controller;

import eu.mrndesign.matned.dto.application.CreditDTO;
import eu.mrndesign.matned.service.ApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerError;
import java.util.List;

@RestController
@RequestMapping("/credit")
public class CreditController {

    private final ApplicationService applicationService;

    public CreditController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping
    public List<CreditDTO> showAllOrders(@RequestParam(defaultValue = "${default.sort.by}", name = "sort") String[] sort,
                                         @RequestParam(defaultValue = "${default.page.start}", name = "page") Integer page,
                                         @RequestParam(defaultValue = "${default.page.size}", name = "amount") Integer amount) throws ServerError {
        return applicationService.findAllCredits(page, amount, sort);
    }

}
