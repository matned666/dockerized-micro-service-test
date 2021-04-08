package eu.mrndesign.matned.dto;

public class ProvidedDataDTO extends BaseDTO {

    private Long creditId;
    private String creditName;
    private String firstName;
    private String lastName;
    private String pesel;
    private String productName;
    private Double productValue;

    public ProvidedDataDTO() {
    }

    public Long getCreditId() {
        return creditId;
    }

    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    public String getCreditName() {
        return creditName;
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

    public String getProductName() {
        return productName;
    }

    public Double getProductValue() {
        return productValue;
    }

    @Override
    public String toString() {
        return "ProvidedDataDTO{" +
                "id=" + creditId +
                ", creditName='" + creditName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", productName='" + productName + '\'' +
                ", productValue=" + productValue +
                '}';
    }


}


