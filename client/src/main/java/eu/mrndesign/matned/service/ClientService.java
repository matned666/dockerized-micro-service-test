package eu.mrndesign.matned.service;

import eu.mrndesign.matned.dto.ClientDTO;
import eu.mrndesign.matned.model.ClientEntity;
import eu.mrndesign.matned.repository.ClientRepository;
import org.springframework.stereotype.Service;
import service.BaseService;

import java.rmi.ServerError;
import java.util.List;
import java.util.stream.Collectors;

import static utils.ErrorMessages.CLIENT_NOT_FOUND;

@Service
public class ClientService extends BaseService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientDTO> findAllClients(Integer page, Integer itemsPerPage, String[] sortBy) {
        return clientRepository.findAll(getPageable(page, itemsPerPage, sortBy))
                .getContent()
                .stream()
                .map(ClientDTO::apply)
                .collect(Collectors.toList());
    }

    public void saveClient(ClientDTO data) {
        clientRepository.save(ClientEntity.create(data));
    }

//    public ClientDTO editClient(Long id, ClientDTO data) throws ServerError {
//        ClientEntity toEdit = getClientBy(id);
//        toEdit.applyChangesFrom(data);
//        return ClientDTO.apply(clientRepository.save(toEdit));
//    }

    public ClientDTO findClientByCreditId(Long creditId) throws ServerError {
        return ClientDTO.apply(clientRepository.findProductByCreditId(creditId).orElseThrow(()->new ServerError(CLIENT_NOT_FOUND, new Error())));
    }

}
