package eu.mrndesign.matned.service;

import eu.mrndesign.matned.dto.ReceivedDataDTO;
import eu.mrndesign.matned.dto.CreditDTO;
import eu.mrndesign.matned.model.Credit;
import eu.mrndesign.matned.repository.CreditRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.rmi.ServerError;
import java.util.ArrayList;
import java.util.List;

import static eu.mrndesign.matned.utils.ErrorMessages.CREDIT_NOT_FOUND;

@Service
public class CreditService extends BaseService {

    private final CreditRepository creditRepository;
    private final RestTemplate restTemplate;


    public CreditService(CreditRepository creditRepository,
                         RestTemplate restTemplate){
        this.creditRepository = creditRepository;
        this.restTemplate = restTemplate;
    }

    public List<ReceivedDataDTO> findAllCredits(Integer page, Integer itemsPerPage, String[] sortBy) {
        List<ReceivedDataDTO> creditList = new ArrayList<>();
        creditRepository.findAll(getPageable(page, itemsPerPage, sortBy))
                .getContent()
                .forEach(x-> {
                    ReceivedDataDTO data = new ReceivedDataDTO(x.getId(), x.getCreditName());
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


    public void addProductData(List<ReceivedDataDTO> creditList, Integer productPort) {
        creditList.forEach(x->{
            ReceivedDataDTO product = getReceivedData("product", productPort, x.getCreditId());
            try {
                x.applyProduct(product);
            } catch (ServerError serverError) {
                System.out.println(serverError.getMessage());
            }
        });
    }

    public void addClientData(List<ReceivedDataDTO> creditList, Integer clientPort) {
        creditList.forEach(x->{
            ReceivedDataDTO client = getReceivedData("client", clientPort, x.getCreditId());
            try {
                x.applyClient(client);
            } catch (ServerError serverError) {
                System.out.println(serverError.getMessage());
            }
        });
    }

    public ReceivedDataDTO getCreatedCredit(Long id, Integer productPort, Integer clientPort) throws ServerError {
        Credit entity = getGreditById(id);
        ReceivedDataDTO credit = new ReceivedDataDTO(entity.getId(), entity.getCreditName());
        ReceivedDataDTO product = getReceivedData("product", productPort, entity.getId());
        ReceivedDataDTO client = getReceivedData("client", clientPort, entity.getId());
        credit.applyProduct(product);
        credit.applyClient(client);
        return credit;
    }

    private ReceivedDataDTO getReceivedData(String host, Integer clientPort, Long id) {
        return restTemplate.getForObject(url(host, clientPort)+"/"+id, ReceivedDataDTO.class);
    }
}
