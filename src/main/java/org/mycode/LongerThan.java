package org.mycode;

public class LongerThan implements Rule {
    private int size;

    public LongerThan(int size) {
        this.size = size;
    }

    @Override
    public ValidationResponse isMatched(String string) {

        ValidationResponse validationResponse = new ValidationResponse();
        if(string.length() >= size){
            validationResponse.setValidationStatus(Boolean.TRUE);
            return validationResponse;
        }
        validationResponse.setValidationStatus(Boolean.FALSE);
        validationResponse.setErrorMessage("Password length should be more than 8 characters");
        return validationResponse;

    }

}
