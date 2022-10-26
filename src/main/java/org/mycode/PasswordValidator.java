package org.mycode;

public class PasswordValidator {

    public static boolean isValid(String password) {
        if (password.isBlank()) {
            return true;
        }
        return (password.length() > 8 ? true :false);
    }
}