package org.mycode;

import java.util.function.IntPredicate;

public class PasswordValidator {

    public static boolean isValid(String password) {
        if (password.isBlank()) {
            return true;
        }
        if(password.length() >= 8 ){
            return true ;
        }

       return false;
    }

    public static boolean IsLowerCase(String value) {
        return contains(value, i -> Character.isLetter(i) && Character.isLowerCase(i));
    }

    public static boolean IsUpperCase(String value) {
        return contains(value, i -> Character.isLetter(i) && Character.isUpperCase(i));
    }

    public static boolean IsNumber(String value) {
        return contains(value, Character::isDigit);
    }

    private static boolean contains(String value, IntPredicate predicate) {
        return value.chars().anyMatch(predicate);
    }

}