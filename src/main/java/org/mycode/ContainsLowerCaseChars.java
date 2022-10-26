package org.mycode;

public class ContainsLowerCaseChars implements Rule {

    @Override
    public ValidationResponse isMatched(String string) {

        ValidationResponse validationResponse = new ValidationResponse();
        if(string.chars().anyMatch(new IsLowerCase())){
            validationResponse.setValidationStatus(Boolean.TRUE);
            return validationResponse;
        }
        validationResponse.setValidationStatus(Boolean.FALSE);

        validationResponse.setErrorMessage("Password should contain at least one lowercase letter(a-z)\"");

        return validationResponse;
    }

}
