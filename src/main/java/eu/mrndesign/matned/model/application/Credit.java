package eu.mrndesign.matned.model.application;


import eu.mrndesign.matned.dto.application.CreditDTO;
import eu.mrndesign.matned.model.audit.BaseEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "CREDIT_ENTITY")
public class Credit extends BaseEntity {

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
}
