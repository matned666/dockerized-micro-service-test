package eu.mrndesign.matned.controller;

import dto.ProvidedDataDTO;
import eu.mrndesign.matned.CreditApplication;
import eu.mrndesign.matned.dto.CreditDTO;
import eu.mrndesign.matned.model.Credit;
import eu.mrndesign.matned.repository.CreditRepository;
import eu.mrndesign.matned.service.CreditService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
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
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static utils.JsonOPS.asJsonString;

@ExtendWith({SpringExtension.class})
@SpringBootTest(classes = {
        CreditApplication.class,
})
@ActiveProfiles("Test")
@AutoConfigureMockMvc
class CreditControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CreditService creditService;
    @MockBean
    private RestTemplate restTemplate;

    Long creditId;
    String creditName;
    String firstName;
    String lastName;
    String pesel;
    String productName;
    String productValue;

    private Credit credit;
    private ProvidedDataDTO providedData;
    private ReceivedData receivedData;
    private String[] sortBy;

    static {
        System.setProperty("credit.port", "8089");
        System.setProperty("client.port", "8090");
        System.setProperty("server.port", "8089");
        System.setProperty("product.port", "8091");
    }

    @BeforeEach
    void setUp() throws NoSuchFieldException, IllegalAccessException {
        creditId = 1L;
        creditName = "asd";
        firstName = "Mattt";
        lastName = "MattNed";
        pesel = "81112110131";
        productName = "HomeAlone";
        productValue = "20000";

        credit = new Credit(creditName);
        Field id = Credit.class.getSuperclass().getDeclaredField("id");
        id.setAccessible(true);
        id.set(credit, creditId);


        providedData = new ProvidedDataDTO();
        providedData.setFirstName(firstName);
        providedData.setLastName(lastName);
        providedData.setPesel(pesel);
        providedData.setProductName(productName);
        providedData.setProductValue(productValue);

        receivedData = new ReceivedData(creditId, creditName);
        receivedData.setFirstName(firstName);
        receivedData.setLastName(lastName);
        receivedData.setPesel(pesel);
        receivedData.setProductName(productName);
        receivedData.setProductValue(Double.parseDouble(productValue));

        sortBy = new String[1];
        sortBy[0] = "something";
    }


    @Test
    void createCreditStatus200() throws Exception {
        doReturn(CreditDTO.apply(credit)).when(creditService).saveCredit(any(CreditDTO.class));
        doReturn("http").when(creditService).url(any(), anyInt());
        doReturn(providedData).when(restTemplate).postForObject("http", providedData, ProvidedDataDTO.class);
        doReturn(receivedData).when(restTemplate).getForObject("http", ReceivedData.class);
        mockMvc.perform(
                MockMvcRequestBuilders.post("/")
                        .content(asJsonString(providedData))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    void createCreditStatus400WithWrongPeselGiven_Validation() throws Exception {
        providedData.setPesel("asd");

        doReturn(CreditDTO.apply(credit)).when(creditService).saveCredit(any(CreditDTO.class));
        doReturn("http").when(creditService).url(any(), anyInt());
        doReturn(providedData).when(restTemplate).postForObject("http", providedData, ProvidedDataDTO.class);
        doReturn(receivedData).when(restTemplate).getForObject("http", ReceivedData.class);
        mockMvc.perform(
                MockMvcRequestBuilders.post("/")
                        .content(asJsonString(providedData))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isBadRequest())
                .andReturn();
    }

    @Test
    void createCreditStatus400WithTooShortName_Validation() throws Exception {
        providedData.setFirstName("a");

        doReturn(CreditDTO.apply(credit)).when(creditService).saveCredit(any(CreditDTO.class));
        doReturn("http").when(creditService).url(any(), anyInt());
        doReturn(providedData).when(restTemplate).postForObject("http", providedData, ProvidedDataDTO.class);
        doReturn(receivedData).when(restTemplate).getForObject("http", ReceivedData.class);
        mockMvc.perform(
                MockMvcRequestBuilders.post("/")
                        .content(asJsonString(providedData))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(status().isBadRequest())
                .andReturn();
    }


}
