package eu.mrndesign.matned.service;

import eu.mrndesign.matned.dto.application.ClientDTO;
import eu.mrndesign.matned.dto.application.CreditDTO;
import eu.mrndesign.matned.dto.application.ProductDTO;
import eu.mrndesign.matned.model.application.ClientEntity;
import eu.mrndesign.matned.model.application.Credit;
import eu.mrndesign.matned.model.application.Product;
import eu.mrndesign.matned.repository.ClientRepository;
import eu.mrndesign.matned.repository.CreditRepository;
import eu.mrndesign.matned.repository.ProductRepository;
import eu.mrndesign.matned.repository.UserRoleRepository;
import org.springframework.stereotype.Service;

import java.rmi.ServerError;
import java.util.List;
import java.util.stream.Collectors;

import static eu.mrndesign.matned.utils.ErrorMessages.*;

@Service
public class ApplicationService extends BaseService {

    private final CreditRepository creditRepository;
    private final ClientRepository clientRepository;
    private final ProductRepository productRepository;
    private final UserRoleRepository userRoleRepository;

    public ApplicationService(CreditRepository creditRepository,
                              ClientRepository clientRepository,
                              ProductRepository productRepository,
                              UserRoleRepository userRoleRepository) {
        this.creditRepository = creditRepository;
        this.clientRepository = clientRepository;
        this.productRepository = productRepository;
        this.userRoleRepository = userRoleRepository;
    }

//    FIND ALL

    public List<CreditDTO> findAllCredits(Integer page, Integer itemsPerPage, String[] sortBy) throws ServerError {
        return creditRepository.findAll(getPageable(page, itemsPerPage, sortBy))
                .getContent()
                .stream()
                .map(CreditDTO::apply)
                .collect(Collectors.toList());
    }

    public List<ClientDTO> findAllClients(Integer page, Integer itemsPerPage, String[] sortBy) throws ServerError {
        return clientRepository.findAll(getPageable(page, itemsPerPage, sortBy))
                .getContent()
                .stream()
                .map(ClientDTO::apply)
                .collect(Collectors.toList());
    }

    public List<ProductDTO> findAllProducts(Integer page, Integer itemsPerPage, String[] sortBy) throws ServerError {
        return productRepository.findAll(getPageable(page, itemsPerPage, sortBy))
                .getContent()
                .stream()
                .map(ProductDTO::apply)
                .collect(Collectors.toList());
    }

//    FIND BY ID

    public CreditDTO findCreditById(Long id) throws ServerError {
        return CreditDTO.apply(getGreditById(id));
    }

    public ClientDTO findClientById(Long id) throws ServerError {
        return ClientDTO.apply(getClientBy(id));
    }

    public ProductDTO findProductById(Long id) throws ServerError {
        return ProductDTO.apply(getProductBy(id));
    }


    //    SAVE

    public CreditDTO saveCredit(CreditDTO data) throws ServerError {
        return CreditDTO.apply(creditRepository.save(Credit.create(data)));
    }

    public ClientDTO saveClient(ClientDTO data, Long creditId) throws ServerError {
        return ClientDTO.apply(clientRepository.save(ClientEntity.create(data, getGreditById(creditId))));
    }

    public ProductDTO saveProduct(ProductDTO data, Long creditId) throws ServerError {
        return ProductDTO.apply(productRepository.save(Product.create(data, getGreditById(creditId))));
    }


//    EDIT

    public CreditDTO editCredit(Long id, CreditDTO data) throws ServerError {
        Credit toEdit = getGreditById(id);
        toEdit.applyChangesFrom(data);
        return CreditDTO.apply(creditRepository.save(toEdit));
    }

    public ClientDTO editClient(Long id, ClientDTO data, Long creditId) throws ServerError {
        Credit newCredit = getGreditById(creditId);
        ClientEntity toEdit = getClientBy(id);
        toEdit.applyChangesFrom(data);
        toEdit.setCreditTo(newCredit);
        return ClientDTO.apply(clientRepository.save(toEdit));
    }

    public ProductDTO editProduct(Long id, ProductDTO data, Long creditId) throws ServerError {
        Credit newCredit = getGreditById(creditId);
        Product toEdit = getProductBy(id);
        toEdit.applyChangesFrom(data);
        toEdit.setCreditTo(newCredit);
        return ProductDTO.apply(productRepository.save(Product.create(data, getGreditById(creditId))));
    }

//   CONNECTION CHECK

    private ApplicationService connect() throws ServerError {
        if (userRoleRepository.checkConnection())
            return this;
        else throw new ServerError(CONNECTION_FAILED, new Error());
    }


//      PRIVATE

    private Product getProductBy(Long id) throws ServerError {
        return productRepository.findById(id).orElseThrow(() -> new ServerError(PRODUCT_NOT_FOUND, new Error()));
    }

    private ClientEntity getClientBy(Long id) throws ServerError {
        return clientRepository.findById(id).orElseThrow(() -> new ServerError(CLIENT_NOT_FOUND, new Error()));
    }

    private Credit getGreditById(Long creditId) throws ServerError {
        return creditRepository.findById(creditId).orElseThrow(() -> new ServerError(CREDIT_NOT_FOUND, new Error()));
    }

}
