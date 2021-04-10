package eu.mrndesign.matned.controller;

import eu.mrndesign.matned.ClientApplication;
import eu.mrndesign.matned.dto.ClientDTO;
import eu.mrndesign.matned.service.ClientService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.doNothing;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static utils.JsonOPS.*;

@ExtendWith({SpringExtension.class})
@SpringBootTest(classes = {
        ClientApplication.class,
})
@ActiveProfiles("Test")
@AutoConfigureMockMvc
class ClientControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ClientService cS;

    static {
        System.setProperty("credit.port", "8089");
        System.setProperty("server.port", "8090");
    }

    @BeforeEach
    void setUp() {
    }

    @Test
    void saveClientAndBackToCredit() throws Exception {
        Mockito.doReturn(new ClientDTO()).when(cS).findClientByCreditId(anyLong());
        mockMvc.perform(
                MockMvcRequestBuilders.get("/1")
                        .accept("application/json"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    void showClientByCreditId() throws Exception {
        ClientDTO cd = new ClientDTO("name", "surname", "123", 1L);
        doNothing().when(cS).saveClient(any());
        mockMvc.perform(
                MockMvcRequestBuilders.post("/")
                        .content(asJsonString(cd))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept("application/json"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk())
                .andReturn();
    }
}