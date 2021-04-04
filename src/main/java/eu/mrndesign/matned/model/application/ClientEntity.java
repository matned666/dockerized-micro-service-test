package eu.mrndesign.matned.model.application;

import eu.mrndesign.matned.dto.application.ClientDTO;
import eu.mrndesign.matned.model.audit.BaseEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "CLIENT_ENTITY")
public class ClientEntity extends BaseEntity implements EditionCreditInfo<ClientDTO> {

    public static ClientEntity create(ClientDTO applied, Credit credit) {
        if (applied != null)
            return new ClientEntity(applied.getFirstName(), applied.getLastName(), applied.getPesel(), credit);
        else return new ClientEntity();
    }

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String pesel;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "credit_id", referencedColumnName = "id")
    private Credit credit;

    public ClientEntity() {
    }

    private ClientEntity(String firstName, String lastName, String pesel, Credit credit) {
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

    public Credit getCredit() {
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
    public void setCreditTo(Credit newData) {
        this.credit = newData;
    }
}
