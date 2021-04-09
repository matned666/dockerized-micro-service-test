package eu.mrndesign.matned.service;

import eu.mrndesign.matned.controller.ReceivedData;
import eu.mrndesign.matned.dto.CreditDTO;
import eu.mrndesign.matned.model.Credit;
import eu.mrndesign.matned.repository.CreditRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import service.BaseService;

import java.rmi.ServerError;
import java.util.ArrayList;
import java.util.List;

import static utils.ErrorMessages.CREDIT_NOT_FOUND;

@Service
public class CreditService extends BaseService {

    private final CreditRepository creditRepository;
    private final RestTemplate restTemplate;


    public CreditService(CreditRepository creditRepository,
                         RestTemplate restTemplate){
        this.creditRepository = creditRepository;
        this.restTemplate = restTemplate;
    }

    public List<ReceivedData> findAllCredits(Integer page, Integer itemsPerPage, String[] sortBy) {
        List<ReceivedData> creditList = new ArrayList<>();
        creditRepository.findAll(getPageable(page, itemsPerPage, sortBy))
                .getContent()
                .forEach(x-> {
                    ReceivedData data = new ReceivedData(x.getId(), x.getCreditName());
                    creditList.add(data);
                });
        return creditList;
    }

    public CreditDTO findCreditById(Long id) throws ServerError {
        return CreditDTO.apply(getGreditById(id));
    }

    public CreditDTO saveCredit(CreditDTO data){
        return CreditDTO.apply(creditRepository.save(Credit.create(data)));
    }
//
//    public CreditDTO editCredit(Long id, CreditDTO data) throws ServerError {
//        Credit toEdit = getGreditById(id);
//        toEdit.applyChangesFrom(data);
//        return CreditDTO.apply(creditRepository.save(toEdit));
//    }




    private Credit getGreditById(Long creditId) throws ServerError {
        return creditRepository.findById(creditId).orElseThrow(() -> new ServerError(CREDIT_NOT_FOUND, new Error()));
    }


    public void addProductData(List<ReceivedData> creditList, Integer productPort) {
        creditList.forEach(x->{
            ReceivedData product = getReceivedData("product", productPort, x.getCreditId());
            try {
                x.applyProduct(product);
            } catch (ServerError serverError) {
                System.out.println(serverError.getMessage());
            }
        });
    }

    public void addClientData(List<ReceivedData> creditList, Integer clientPort) {
        creditList.forEach(x->{
            ReceivedData client =getReceivedData("client", clientPort, x.getCreditId());
            try {
                x.applyClient(client);
            } catch (ServerError serverError) {
                System.out.println(serverError.getMessage());
            }
        });
    }

    public ReceivedData getCreatedCredit(Long id, Integer productPort, Integer clientPort) throws ServerError {
        Credit entity = getGreditById(id);
        ReceivedData credit = new ReceivedData(entity.getId(), entity.getCreditName());
        ReceivedData product = getReceivedData("product", productPort, entity.getId());
        ReceivedData client = getReceivedData("client", clientPort, entity.getId());
        credit.applyProduct(product);
        credit.applyClient(client);
        return credit;
    }

    private ReceivedData getReceivedData(String host, Integer clientPort, Long id) {
        return restTemplate.getForObject(url(host, clientPort)+"/"+id, ReceivedData.class);
    }
}
