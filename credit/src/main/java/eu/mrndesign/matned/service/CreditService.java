package eu.mrndesign.matned.service;

import dto.ProvidedDataDTO;
import eu.mrndesign.matned.dto.CreditDTO;
import eu.mrndesign.matned.model.Credit;
import eu.mrndesign.matned.repository.CreditRepository;
import org.springframework.stereotype.Service;
import service.BaseService;

import java.rmi.ServerError;
import java.util.ArrayList;
import java.util.List;

import static utils.ErrorMessages.CREDIT_NOT_FOUND;

@Service
public class CreditService extends BaseService {

    private final CreditRepository creditRepository;

    public CreditService(CreditRepository creditRepository){
        this.creditRepository = creditRepository;
    }

    public List<ProvidedDataDTO> findAllCredits(Integer page, Integer itemsPerPage, String[] sortBy) {
        List<ProvidedDataDTO> creditMap = new ArrayList<>();
        creditRepository.findAll(getPageable(page, itemsPerPage, sortBy))
                .getContent()
                .forEach(x-> {
                    ProvidedDataDTO data = new ProvidedDataDTO();
                    data.setCreditId(x.getId());
                    data.setCreditName(x.getCreditName());
                    creditMap.add(data);
                });
        return creditMap;
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


    public void addProductData(List<ProvidedDataDTO> creditList) {

    }

    public void addClientData(List<ProvidedDataDTO> creditList) {

    }
}
