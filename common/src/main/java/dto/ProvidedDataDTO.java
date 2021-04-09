package dto;


import validation.IsCorrectPesel;
import validation.IsNumericDouble;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ProvidedDataDTO{

    @Null(message = "The credit id is generated and cannot be provided")
    private Long creditId;

    @Null(message = "The credit name is generated and cannot be provided")
    private String creditName;

    @NotNull(message = "The first name field cannot be empty")
    @Size(min = 2, message = "The first name must be at least {min} signs long")
    @Pattern(regexp = "[A-z]{0,}", message = "Name should contain only letters")
    private String firstName;

    @NotNull(message = "The last name field cannot be empty")
    @Size(min = 2, message = "The last name must be at least {min} signs long")
    @Pattern(regexp = "[A-z]{0,}", message = "Name should contain only letters")
    private String lastName;

    @NotNull(message = "The pesel field cannot be empty")
    @Size(min = 11, max = 11, message = "The pesel must be {min} signs long")
    @IsCorrectPesel(message = "Incorrect pesel pattern, please provide correct one")
    private String pesel;

    @NotNull(message = "The product name field cannot be empty")
    @Size(min = 5, message = "The product name must be at least {min} signs long")
    private String productName;

    @NotNull(message = "The product value field cannot be empty")
    @IsNumericDouble(message = "Provided data is not a double number")
    private String productValue;

    public ProvidedDataDTO() {
    }

    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
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
