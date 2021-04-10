package eu.mrndesign.matned.service;

import eu.mrndesign.matned.ClientApplication;
import eu.mrndesign.matned.dto.ClientDTO;
import eu.mrndesign.matned.model.ClientEntity;
import eu.mrndesign.matned.repository.ClientRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;


import java.rmi.ServerError;
import java.util.Collections;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doReturn;

@ExtendWith({SpringExtension.class})
@SpringBootTest(classes = {
        ClientApplication.class,
})
@ActiveProfiles("Test")
class ClientServiceTest {

    @Autowired
    private ClientService clientService;

    @MockBean
    private ClientRepository clientRepository;



    private ClientEntity clientEntity;
    private String[] sortBy;

    static {
        System.setProperty("credit.port", "8089");
        System.setProperty("server.port", "8090");
    }
    @BeforeEach
    void setUp() {
        clientEntity = new ClientEntity("","","",1L);
        sortBy = new String[1];
        sortBy[0] = "something";
    }

    @Test
    void findAllClients() {
        doReturn(new PageImpl<>(Collections.singletonList(clientEntity))).when(clientRepository).findAll(any(Pageable.class));

        assertEquals(Collections.singletonList(ClientDTO.apply(clientEntity)), clientService.findAllClients(1,1,sortBy));
    }

    @Test
    void findClientByCreditId() throws ServerError {
        doReturn(Optional.of(clientEntity)).when(clientRepository).findClientByCreditId(anyLong());

        assertEquals(ClientDTO.apply(clientEntity), clientService.findClientByCreditId(1L));
    }

    @Test
    void findClientByCreditIdThrowsServerErrorWhenNotFound() {
        doReturn(Optional.empty()).when(clientRepository).findClientByCreditId(anyLong());

        assertThrows(ServerError.class, () -> clientService.findClientByCreditId(1L));
    }


}