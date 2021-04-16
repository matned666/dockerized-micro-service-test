package eu.mrndesign.matned.dto;


public class ProvidedDataDTO{

    private Long creditId;
    private String creditName;
    private String firstName;
    private String lastName;
    private String pesel;
    private String productName;
    private String productValue;

    public ProvidedDataDTO() {
    }

    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductValue(String productValue) {
        this.productValue = productValue;
    }

    public Long getCreditId() {
        return creditId;
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

    public String getProductValue() {
        return productValue;
    }

}
