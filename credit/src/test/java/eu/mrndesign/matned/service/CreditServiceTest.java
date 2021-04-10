package eu.mrndesign.matned.service;

import eu.mrndesign.matned.CreditApplication;
import eu.mrndesign.matned.controller.ReceivedData;
import eu.mrndesign.matned.dto.CreditDTO;
import eu.mrndesign.matned.model.Credit;
import eu.mrndesign.matned.repository.CreditRepository;
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

import java.lang.reflect.Field;
import java.rmi.ServerError;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doReturn;

@ExtendWith({SpringExtension.class})
@SpringBootTest(classes = {
        CreditApplication.class,
})
@ActiveProfiles("Test")
class CreditServiceTest {

    @Autowired
    private CreditService creditService;

    @MockBean
    private CreditRepository creditRepository;
    @MockBean
    private RestTemplate restTemplate;


    private Credit credit;
    private String[] sortBy;

    static {
        System.setProperty("credit.port", "8089");
        System.setProperty("client.port", "8090");
        System.setProperty("server.port", "8089");
        System.setProperty("product.port", "8091");
    }

    @BeforeEach
    void setUp() {
        credit = new Credit();
        sortBy = new String[1];
        sortBy[0] = "something";
    }


    @Test
    void findAllCredits() {
        ReceivedData receivedData = new ReceivedData();
        doReturn(new PageImpl<>(Collections.singletonList(credit))).when(creditRepository).findAll(any(Pageable.class));
        assertEquals(Collections.singletonList(receivedData), creditService.findAllCredits(1,1,sortBy));
    }

    @Test
    void findCreditById() throws ServerError {
        doReturn(Optional.of(credit)).when(creditRepository).findById(anyLong());
        assertEquals(CreditDTO.apply(credit), creditService.findCreditById(1L));
    }

    @Test
    void findCreditByIdThrowsServerErrorWhenCreditNotFound() {
        doReturn(Optional.empty()).when(creditRepository).findById(anyLong());
        assertThrows(ServerError.class, () -> creditService.findCreditById(1L));
    }

    @Test
    void saveCredit() {
        doReturn(Optional.of(credit)).when(creditRepository).findById(anyLong());
        assertEquals(CreditDTO.apply(credit), creditService.saveCredit(CreditDTO.apply(credit)));
    }

    @Test
    void addProductData() {
        ReceivedData receivedData1 = new ReceivedData(1L, "asd");
        List<ReceivedData> list = Collections.singletonList(receivedData1);
        ReceivedData receivedData2 = new ReceivedData();
        receivedData2.setProductName("product");
        receivedData2.setProductValue(1000.0);
        doReturn(receivedData2).when(restTemplate).getForObject("http://product:1000/1", ReceivedData.class);

        assertNull(list.get(0).getProductName());
        assertNull(list.get(0).getProductValue());

        creditService.addProductData(list, 1000);

        assertEquals(list.get(0).getProductName(), "product");
        assertEquals(list.get(0).getProductValue(), 1000.0);

    }


    @Test
    void addClientData() {
        ReceivedData receivedData1 = new ReceivedData(1L, "asd");
        List<ReceivedData> list = Collections.singletonList(receivedData1);
        ReceivedData receivedData2 = new ReceivedData();
        receivedData2.setFirstName("janusz");
        receivedData2.setLastName("kowalski");

        doReturn(receivedData2).when(restTemplate).getForObject("http://client:1000/1", ReceivedData.class);

        assertNull(list.get(0).getFirstName());
        assertNull(list.get(0).getLastName());

        creditService.addClientData(list, 1000);

        assertEquals(list.get(0).getFirstName(), "janusz");
        assertEquals(list.get(0).getLastName(), "kowalski");
    }

    @Test
    void getCreatedCredit_CheckIfAllDataIsSet() throws ServerError, NoSuchFieldException, IllegalAccessException {

        String name = "janusz";
        String surname = "kowalski";
        String pesel = "22222";
        String prod = "product";
        Double price =1000.0;
        credit = new Credit("asd");

        Field id = Credit.class.getSuperclass().getDeclaredField("id");
        id.setAccessible(true);
        id.set(credit, 1L);

        ReceivedData receivedData2 = new ReceivedData();
        ReceivedData receivedData3 = new ReceivedData();
        receivedData2.setFirstName(name);
        receivedData2.setLastName(surname);
        receivedData2.setPesel(pesel);
        receivedData3.setProductName(prod);
        receivedData3.setProductValue(price);

        doReturn(Optional.of(credit)).when(creditRepository).findById(anyLong());
        doReturn(receivedData2).when(restTemplate).getForObject("http://client:1000/1", ReceivedData.class);
        doReturn(receivedData3).when(restTemplate).getForObject("http://product:1000/1", ReceivedData.class);

        ReceivedData creditData = creditService.getCreatedCredit(1L, 1000, 1000);

        assertEquals(creditData.getFirstName(), name);
        assertEquals(creditData.getLastName(), surname);
        assertEquals(creditData.getPesel(), pesel);
        assertEquals(creditData.getProductName(), prod);
        assertEquals(creditData.getProductValue(), price);
    }
}