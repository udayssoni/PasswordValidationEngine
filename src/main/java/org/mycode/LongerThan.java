package org.mycode;

public class LongerThan implements Rule {
    private int size;

    public LongerThan(int size) {
        this.size = size;
    }

    @Override
    public ResponseObject isMatched(String string) {

        ResponseObject responseObject = new ResponseObject();
        if(string.length() >= size){
            responseObject.setValidationStatus(Boolean.TRUE);
            return responseObject ;
        }
        responseObject.setValidationStatus(Boolean.FALSE);
        responseObject.setErrorMessage("Password length should be more than 8 characters");
        return responseObject;

    }

}
