package org.mycode;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PasswordValidationTest {


    @Test
    public void validation_password_length_longer_then_8_characters() throws InvalidPasswordException {
        String password = "uday1234567";
        PasswordValidator.isPasswordLengthValid(password);
    }

    @Test
    public void validation_password_length_not_longer_then_8_characters()
    {
        String password = "uday456";
        Exception exception = Assertions.assertThrows(InvalidPasswordException.class, () -> {
            PasswordValidator.isPasswordLengthValid(password);
        });

      /*  String expectedMessage = "Invalid password: Password length should be between 8 to 15 characters";
        String actualMessage = exception.getMessage();
        System.out.println(expectedMessage);
        System.out.println(actualMessage);*/

      //  Assertions.assertex(actualMessage.contains(expectedMessage));

    }
    @Test
    public void validation_password_having_one_uppercase_char ()  throws InvalidPasswordException
    {
        String password = "Uday123456";
       PasswordValidator.IsUpperCase(password);
    }

    @Test
    public void validation_password_having_one_uppercase_char_negative() {
        String password = "uday456";
        Exception exception = Assertions.assertThrows(InvalidPasswordException.class, () -> {
            PasswordValidator.IsUpperCase(password);
        });

    }
    @Test
    public void validation_password_having_one_lowercase_char() throws InvalidPasswordException {
        String password = "UDAy456";
        PasswordValidator.IsLowerCase(password);
    }

    @Test
    public void validation_password_having_one_lowercase_char_negative() throws InvalidPasswordException {
        String password = "123456";
        Exception exception = Assertions.assertThrows(InvalidPasswordException.class, () -> {
            PasswordValidator.IsLowerCase(password);
        });
    }

    @Test
    public void validation_password_having_one_number()  throws InvalidPasswordException
    {
        String password = "Uday6";
        PasswordValidator.IsNumber(password);
    }

    @Test
    public void validation_password_having_one_number_negative() throws InvalidPasswordException {
        String password = "ABC";
        Exception exception = Assertions.assertThrows(InvalidPasswordException.class, () -> {
            PasswordValidator.IsNumber(password);
        });
    }

    @Test
    public void validation_password_is_not_null()  throws InvalidPasswordException
    {
        String password = "Uday6";
        PasswordValidator.isPasswordNull(password);
    }

    @Test
    public void validation_password_is_not_null_negative() throws InvalidPasswordException {
        String password = null ;
        Exception exception = Assertions.assertThrows(InvalidPasswordException.class, () -> {
            PasswordValidator.isPasswordNull(password);
        });
    }

}
