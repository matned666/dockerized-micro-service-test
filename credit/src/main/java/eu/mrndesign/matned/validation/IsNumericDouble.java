package eu.mrndesign.matned.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IsNumericDoubleValidator.class)
@Documented
public @interface IsNumericDouble {
    String message() default "It should be a double value.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
