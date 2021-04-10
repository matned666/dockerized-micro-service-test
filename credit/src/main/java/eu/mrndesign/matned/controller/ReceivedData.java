package eu.mrndesign.matned.controller;

import dto.ProvidedDataDTO;

import java.rmi.ServerError;
import java.util.Objects;

import static utils.ErrorMessages.EMPTY_DATA_PROVIDED;

public class ReceivedData {


    private Long creditId;
    private String creditName;
    private String firstName;
    private String lastName;
    private String pesel;
    private String productName;
    private Double productValue;

    public ReceivedData() {
    }

    public ReceivedData(Long id, String creditName) {
        this.creditId = id;
        this.creditName = creditName;
    }

    public static ReceivedData convert(ProvidedDataDTO provider) throws ServerError {
        if(provider != null) {
            ReceivedData receiver = new ReceivedData(provider.getCreditId(), provider.getCreditName());
            receiver.setFirstName(provider.getFirstName());
            receiver.setLastName(provider.getLastName());
            receiver.setPesel(provider.getPesel());
            receiver.setProductName(provider.getProductName());
            receiver.setProductValue(provider.getProductValue() != null ? Double.parseDouble(provider.getProductValue()): null);
            return receiver;
        } else throw new ServerError(EMPTY_DATA_PROVIDED, new Error());
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

    public void setProductValue(Double productValue) {
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

    public Double getProductValue() {
        return productValue;
    }

    public void applyProduct(ReceivedData product) throws ServerError {
        if (product != null) {
            this.productName = product.productName;
            this.productValue = product.productValue;
        } else {
            throw new ServerError("No data provided", new Error());
        }
    }

    public void applyClient(ReceivedData client) throws ServerError {
        if (client != null) {
            this.firstName = client.firstName;
            this.lastName = client.lastName;
            this.pesel = client.pesel;
        } else {
            throw new ServerError("No data provided", new Error());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReceivedData that = (ReceivedData) o;
        return Objects.equals(creditId, that.creditId) && Objects.equals(creditName, that.creditName) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(pesel, that.pesel) && Objects.equals(productName, that.productName) && Objects.equals(productValue, that.productValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditId, creditName, firstName, lastName, pesel, productName, productValue);
    }
}
