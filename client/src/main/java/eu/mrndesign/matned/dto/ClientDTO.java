package eu.mrndesign.matned.dto;

import dto.BaseDTO;
import dto.ProvidedDataDTO;
import eu.mrndesign.matned.model.ClientEntity;

import java.rmi.ServerError;
import java.util.Objects;

import static utils.ErrorMessages.EMPTY_DATA_PROVIDED;

public class ClientDTO extends BaseDTO {


    public static ClientDTO createFromProvidedData(ProvidedDataDTO creditData) throws ServerError {
        if (creditData != null) {
            return new ClientDTO(creditData.getFirstName(), creditData.getLastName(), creditData.getPesel(), creditData.getCreditId());
        } else
            throw new ServerError(EMPTY_DATA_PROVIDED, new Error());
    }

    public static ClientDTO apply(ClientEntity applied){
        return new ClientDTO(applied);
    }

    private String firstName;
    private String lastName;
    private String pesel;
    private Long creditId;

    public ClientDTO() {
    }

    private ClientDTO(ClientEntity applied) {
        if (applied != null) {
            this.id = applied.getId();
            this.firstName = applied.getFirstName();
            this.lastName = applied.getLastName();
            this.pesel = applied.getPesel();
            this.creditId = applied.getCredit();
        }
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

    @Override
    public String toString() {
        return "{" +
                "\"id\":" + id +
                ",\"firstName\":\"" + firstName + '\"' +
                ", \"lastName\":\"" + lastName + '\"' +
                ", \"pesel\":\"" + pesel + '\"' +
                ", \"creditId\":" + creditId +
                '}';
    }
}
