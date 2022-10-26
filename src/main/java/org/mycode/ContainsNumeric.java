package org.mycode;

import java.util.function.IntPredicate;

public class ContainsNumeric implements Rule {


    @Override
    public ValidationResponse isMatched(String str) {

        ValidationResponse validationResponse = new ValidationResponse();
        if(str.chars().anyMatch(new IsDigit())){
            validationResponse.setValidationStatus(Boolean.TRUE);
            return validationResponse;
        }
        validationResponse.setValidationStatus(Boolean.FALSE);
        validationResponse.setErrorMessage("Password should contain at least one digit(0-9)\"");
        return validationResponse;

    }
    private final class IsDigit implements IntPredicate {
        @Override
        public boolean test(int asciiValue) {
            return asciiValue >= 48 && asciiValue <= 57;
        }
    }

}
