package eu.mrndesign.matned.dto;

import eu.mrndesign.matned.model.Product;

import java.util.Objects;

public class ProductDTO extends BaseDTO{

    public static ProductDTO apply(Product applied){
        return new ProductDTO(applied);
    }

    private String productName;
    private Double productValue;
    private Long creditId;

    public ProductDTO() {
    }

    private ProductDTO(Product applied) {
        super(applied);
        if (applied != null){
            this.productName = applied.getProductName();
            this.productValue = applied.getProductValue();
            this.creditId = applied.getCredit();
        }
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductValue() {
        return productValue;
    }

    public Long getCreditId() {
        return creditId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDTO that = (ProductDTO) o;
        return Objects.equals(productName, that.productName) && Objects.equals(productValue, that.productValue) && Objects.equals(creditId, that.creditId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productValue, creditId);
    }


}
