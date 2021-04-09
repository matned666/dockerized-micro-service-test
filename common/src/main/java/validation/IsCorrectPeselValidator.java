package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class IsCorrectPeselValidator implements ConstraintValidator<IsCorrectPesel, String> {

    @Override
    public void initialize(IsCorrectPesel constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        this.peselArray = getPeselArray(value);
        if (isValidPesel()) return true;
        else return false;

    }


    private int[] peselArray;
    final private int[] peselAlgorithmNumbers = new int[]{9, 7, 3, 1, 9, 7, 3, 1, 9, 7};


    public int[] getPeselArray(String pesel) {
        String[] peselStringArray = pesel.split("");
        int[] peselIntArray = new int[peselStringArray.length];
        AtomicInteger counter = new AtomicInteger(0);
        AtomicInteger counter2 = new AtomicInteger(0);
        Arrays.stream(peselStringArray)
                .forEach(x -> {
                    try {
                        peselIntArray[counter.get()] = Integer.parseInt(peselStringArray[counter2.get()]);
                        counter.incrementAndGet();
                    } catch (NumberFormatException ignored) {
                    }
                    counter2.incrementAndGet();
                });
        return peselIntArray;
    }


    public boolean isValidPesel() {
        int checkNo = peselArray[0] * peselAlgorithmNumbers[0];
        for (int i = 1; i < 10; i++) {
            try {
                checkNo += (peselArray[i] * peselAlgorithmNumbers[i]);
            } catch (ArrayIndexOutOfBoundsException err) {
                return false;
            }
        }
        try {
            return this.peselArray[10] == checkNo % 10;
        } catch (ArrayIndexOutOfBoundsException err) {
            return false;
        }
    }
}
