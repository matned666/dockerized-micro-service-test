package eu.mrndesign.matned.service;

import eu.mrndesign.matned.dto.CreditDTO;
import eu.mrndesign.matned.model.Credit;
import eu.mrndesign.matned.repository.CreditRepository;
import org.springframework.stereotype.Service;
import service.BaseService;

import java.rmi.ServerError;
import java.util.List;
import java.util.stream.Collectors;

import static utils.ErrorMessages.CREDIT_NOT_FOUND;


@Service
public class CreditService extends BaseService {

    private final CreditRepository creditRepository;

    public CreditService(CreditRepository creditRepository) {
        this.creditRepository = creditRepository;
    }

    public List<CreditDTO> findAllCredits(Integer page, Integer itemsPerPage, String[] sortBy) {
        return creditRepository.findAll(getPageable(page, itemsPerPage, sortBy))
                .getContent()
                .stream()
                .map(CreditDTO::apply)
                .collect(Collectors.toList());
    }

    public CreditDTO findCreditById(Long id) throws ServerError {
        return CreditDTO.apply(getCreditByCreditId(id));
    }

    public CreditDTO saveCredit(CreditDTO data){
        return CreditDTO.apply(creditRepository.save(Credit.create(data)));
    }

    public CreditDTO editCredit(Long id, CreditDTO data) throws ServerError {
        Credit toEdit = getCreditByCreditId(id);
        toEdit.applyChangesFrom(data);
        return CreditDTO.apply(creditRepository.save(toEdit));
    }




    private Credit getCreditByCreditId(Long creditId) throws ServerError {
        return creditRepository.findById(creditId).orElseThrow(() -> new ServerError(CREDIT_NOT_FOUND, new Error()));
    }



}
