package eu.mrndesign.matned.service;

import eu.mrndesign.matned.ClientApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({SpringExtension.class})
@SpringBootTest(classes = {
        ClientApplication.class,
})
class ClientServiceTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void findAllClients() {
    }

    @Test
    void saveClient() {
    }

    @Test
    void findClientByCreditId() {
    }
}