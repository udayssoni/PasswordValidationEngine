package org.mycode;

import java.util.function.IntPredicate;

public class PasswordValidator {

    public static void isPasswordNull(String password) throws InvalidPasswordException
    {
        if(password == null){
            throw new InvalidPasswordException(2);
        }
    }

    public static void isPasswordLengthValid(String password) throws InvalidPasswordException
    {
        if(password.length() < 8){
            throw new InvalidPasswordException(1);
        }
    }

    public static void IsLowerCase(String value) throws InvalidPasswordException {
        if(!contains(value, i -> Character.isLetter(i) && Character.isLowerCase(i))){
            throw new InvalidPasswordException(4);
        }
    }

    public static void IsUpperCase(String value)throws InvalidPasswordException{
        if(!contains(value, i -> Character.isLetter(i) && Character.isUpperCase(i))){
            throw new InvalidPasswordException(3);
        }
    }

    public static void IsNumber(String value) throws InvalidPasswordException{
        if(!contains(value, i ->  Character.isDigit(i))){
            throw new InvalidPasswordException(5);
        }
    }

    private static boolean contains(String value, IntPredicate predicate) throws InvalidPasswordException{
        return value.chars().anyMatch(predicate);
    }


    public static void main (String args[]){

        String password = "uday";
        try {
            PasswordValidator.IsNumber(password);
        } catch (InvalidPasswordException e) {
            throw new RuntimeException(e);
        }

    }
}