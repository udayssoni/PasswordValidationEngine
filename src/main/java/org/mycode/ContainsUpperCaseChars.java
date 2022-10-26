package org.mycode;

public class ContainsUpperCaseChars implements Rule {

    @Override
    public ValidationResponse isMatched(String string) {

        ValidationResponse validationResponse = new ValidationResponse();
        if(string.chars().anyMatch(new IsUppercase())){
            validationResponse.setValidationStatus(Boolean.TRUE);
            return validationResponse;
        }
        validationResponse.setValidationStatus(Boolean.FALSE);

        validationResponse.setErrorMessage("Password should contain at least one uppercase letter(A-Z)\"");

        return validationResponse;
    }

}
