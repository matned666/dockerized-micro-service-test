package eu.mrndesign.matned.dto;

import eu.mrndesign.matned.utils.ErrorMessages;

import java.rmi.ServerError;
import java.util.Objects;

import static eu.mrndesign.matned.utils.ErrorMessages.EMPTY_DATA_PROVIDED;

public class ClientDTO extends BaseDTO{

    public static ClientDTO createFromCreditData(Long id, ProvidedDataDTO creditData) throws ServerError {
        if (creditData != null && id != null) {
            return new ClientDTO(creditData.getFirstName(), creditData.getLastName(), creditData.getPesel(), id);
        } else
            throw new ServerError(EMPTY_DATA_PROVIDED, new Error());    }

    private String firstName;
    private String lastName;
    private String pesel;

    private Long creditId;

    public ClientDTO() {
    }

    public ClientDTO(String firstName, String lastName, String pesel, Long creditId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.creditId = creditId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public Long getCreditId() {
        return creditId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientDTO clientDTO = (ClientDTO) o;
        return Objects.equals(firstName, clientDTO.firstName) && Objects.equals(lastName, clientDTO.lastName) && Objects.equals(pesel, clientDTO.pesel) && Objects.equals(creditId, clientDTO.creditId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, pesel, creditId);
    }


}
