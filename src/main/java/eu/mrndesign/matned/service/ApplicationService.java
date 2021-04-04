package eu.mrndesign.matned.service;

import eu.mrndesign.matned.repository.ClientRepository;
import eu.mrndesign.matned.repository.CreditRepository;
import eu.mrndesign.matned.repository.ProductRepository;

public class ApplicationService extends BaseService{

    private final CreditRepository creditRepository;
    private final ClientRepository clientRepository;
    private final ProductRepository productRepository;

    public ApplicationService(CreditRepository creditRepository,
                              ClientRepository clientRepository,
                              ProductRepository productRepository) {
        this.creditRepository = creditRepository;
        this.clientRepository = clientRepository;
        this.productRepository = productRepository;
    }


//    TODO



}
