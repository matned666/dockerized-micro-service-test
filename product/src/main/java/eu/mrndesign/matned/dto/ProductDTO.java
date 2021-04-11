package eu.mrndesign.matned.dto;

import eu.mrndesign.matned.model.Product;

import java.rmi.ServerError;
import java.util.Objects;

import static eu.mrndesign.matned.utils.ErrorMessages.EMPTY_DATA_PROVIDED;

public class ProductDTO extends BaseDTO {



    public static ProductDTO createFromProvidedData(ProvidedDataDTO creditData) throws ServerError {
        if (creditData != null) {
            return new ProductDTO(creditData.getProductName(),
                    creditData.getProductValue() != null? Double.parseDouble(creditData.getProductValue()): null,
                    creditData.getCreditId());
        } else
            throw new ServerError(EMPTY_DATA_PROVIDED, new Error());
    }

    public static ProductDTO apply(Product applied){
        return new ProductDTO(applied);
    }

    private String productName;
    private Double productValue;
    private Long creditId;

    public ProductDTO() {
    }

    public ProductDTO(String productName, Double productValue, Long creditId) {
        this.productName = productName;
        this.productValue = productValue;
        this.creditId = creditId;
    }

    private ProductDTO(Product applied) {
        if (applied != null){
            this.id = applied.getId();
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
