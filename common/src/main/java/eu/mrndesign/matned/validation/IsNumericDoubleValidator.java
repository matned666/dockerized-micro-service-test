package eu.mrndesign.matned.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsNumericDoubleValidator implements ConstraintValidator<IsNumericDouble, String> {

    @Override
    public void initialize(IsNumericDouble constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        try{
            Double check = Double.parseDouble(value);
            return true;
        }catch (Exception ignored){
            return false;
        }
    }
}
