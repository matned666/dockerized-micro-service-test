package eu.mrndesign.matned.dto.application;

import eu.mrndesign.matned.model.application.Credit;

import java.util.Objects;

public class CreditDTO extends BaseDTO {

    public static CreditDTO apply(Credit applied){
        return new CreditDTO(applied);
    }

    private String creditName;

    public CreditDTO() {
    }

    private CreditDTO(Credit applied) {
        super(applied);
        if (applied != null)
            this.creditName = applied.getCreditName();
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


}
