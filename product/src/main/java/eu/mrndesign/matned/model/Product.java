package eu.mrndesign.matned.model;

import eu.mrndesign.matned.dto.ProductDTO;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_ENTITY")
public class Product extends BaseEntity implements EditionCreditInfo<ProductDTO> {

    public static Product create(ProductDTO applied) {
        if (applied != null) return new Product(applied.getProductName(), applied.getProductValue(), applied.getCreditId());
        else return new Product();
    }

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_value")
    private Double productValue;

    @Column(name = "credit_id")
    private Long credit;

    public Product() {
    }

    private Product(String productName, Double productValue, Long credit) {
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

    public Long getCredit() {
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

    @Override
    public void applyChangesFrom(ProductDTO data) {
        if (data != null) {
            if (data.getProductName() != null)
                if (!data.getProductName().isEmpty())
                    this.productName = data.getProductName();
            if (data.getProductValue() != null)
                this.productValue = data.getProductValue();
        }
    }

    @Override
    public void setCreditTo(Long newData) {
        this.credit = newData;
    }
}
