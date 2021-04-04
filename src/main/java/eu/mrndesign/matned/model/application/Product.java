package eu.mrndesign.matned.model.application;

import eu.mrndesign.matned.dto.application.ProductDTO;
import eu.mrndesign.matned.model.audit.BaseEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "PRODUCT_ENTITY")
public class Product extends BaseEntity {

    public static Product create(ProductDTO applied, Credit credit){
        if (applied != null) return new Product(applied.getProductName(), applied.getProductValue(), credit);
        else return new Product();
    }

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_value")
    private Double productValue;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "credit_id", referencedColumnName = "id")
    private Credit credit;

    public Product() {
    }

    private Product(String productName, Double productValue, Credit credit) {
        this.productName = productName;
        this.productValue = productValue;
        this.credit = credit;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductValue() {
        return productValue;
    }

    public Credit getCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productValue=" + productValue +
                ", credit=" + credit +
                '}';
    }
}
