package eu.mrndesign.matned.dto;

import dto.BaseDTO;
import dto.ProvidedDataDTO;
import eu.mrndesign.matned.model.Credit;
import wiremock.org.apache.commons.lang3.RandomStringUtils;

import java.rmi.ServerError;
import java.util.Objects;

import static utils.ErrorMessages.EMPTY_DATA_PROVIDED;

public class CreditDTO extends BaseDTO {

    public static final int RANDOM_CREDIT_NAME_LENGTH = 10;

    public static CreditDTO apply(Credit applied){
        return new CreditDTO(applied);
    }

    public static CreditDTO createFromProvidedData(ProvidedDataDTO creditData) throws ServerError {
        if (creditData != null) {
            return new CreditDTO();
        } else
            throw new ServerError(EMPTY_DATA_PROVIDED, new Error());    }

    private String creditName;

    public CreditDTO() {
        this.creditName = RandomStringUtils.random(RANDOM_CREDIT_NAME_LENGTH, true, true);
    }

    private CreditDTO(Credit applied) {
        if (applied != null) {
            this.id = applied.getId();
            this.creditName = applied.getCreditName();
        }
    }



    public String getCreditName() {
        return creditName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditDTO creditDTO = (CreditDTO) o;
        return Objects.equals(creditName, creditDTO.creditName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditName);
    }

    @Override
    public String toString() {
        return "CreditDTO{" +
                "id=" + id +
                ", creditName='" + creditName + '\'' +
                '}';
    }
}
