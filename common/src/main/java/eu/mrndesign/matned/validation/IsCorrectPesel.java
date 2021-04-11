package eu.mrndesign.matned.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IsCorrectPeselValidator.class)
@Documented
public @interface IsCorrectPesel {
    String message() default "Incorrect pesel pattern";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
