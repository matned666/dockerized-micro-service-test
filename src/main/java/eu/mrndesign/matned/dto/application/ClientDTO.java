package eu.mrndesign.matned.dto.application;

import eu.mrndesign.matned.model.application.ClientEntity;

import java.util.Objects;

public class ClientDTO extends BaseDTO{

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
        super(applied);
        if (applied != null) {
            this.firstName = applied.getFirstName();
            this.lastName = applied.getLastName();
            this.pesel = applied.getPesel();
            this.creditId = applied.getCredit() != null ? applied.getCredit().getId() : null;
        }
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
