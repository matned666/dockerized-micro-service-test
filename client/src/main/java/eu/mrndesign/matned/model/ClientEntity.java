package eu.mrndesign.matned.model;

import eu.mrndesign.matned.dto.ClientDTO;
import model.BaseEntity;
import model.EditionCreditInfo;

import javax.persistence.*;


@Entity
@Table(name = "CLIENT_ENTITY")
public class ClientEntity extends BaseEntity implements EditionCreditInfo<ClientDTO> {

    public static ClientEntity create(ClientDTO applied) {
        if (applied != null)
            return new ClientEntity(applied.getFirstName(), applied.getLastName(), applied.getPesel(), applied.getCreditId());
        else return new ClientEntity();
    }

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String pesel;

    @Column(name = "credit_id")
    private Long credit;

    public ClientEntity() {
    }

    public ClientEntity(String firstName, String lastName, String pesel, Long credit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.credit = credit;
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

    public Long getCredit() {
        return credit;
    }

    @Override
    public void applyChangesFrom(ClientDTO data) {
        if (data != null) {
            if (data.getFirstName() != null)
                if (!data.getFirstName().isEmpty())
                    this.firstName = data.getFirstName();
            if (data.getLastName() != null)
                if (!data.getLastName().isEmpty())
                    this.lastName = data.getLastName();
            if (data.getPesel() != null)
                if (!data.getPesel().isEmpty())
                    this.pesel = data.getPesel();
        }
    }

    @Override
    public void setCreditTo(Long newData) {
        this.credit = newData;
    }
}
