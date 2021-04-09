package eu.mrndesign.matned.model;

import eu.mrndesign.matned.dto.CreditDTO;
import model.BaseEntity;
import model.Editional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CREDIT_ENTITY")
public class Credit extends BaseEntity implements Editional<CreditDTO> {

    public static Credit create(CreditDTO applied){
        return new Credit(applied != null? applied.getCreditName() : null);
    }

    @Column(name = "credit_name")
    private String creditName;

    public Credit() {
    }

    private Credit(String creditName) {
        this.creditName = creditName;
    }

    public String getCreditName() {
        return creditName;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "creditName='" + creditName + '\'' +
                '}';
    }

    @Override
    public void applyChangesFrom(CreditDTO data) {
        if (data != null) {
            if (data.getCreditName() != null)
                if (!data.getCreditName().isEmpty())
                    this.creditName = data.getCreditName();
        }
    }
}
