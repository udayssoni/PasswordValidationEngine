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
   /* @Test
    public void validation_password_having_one_uppercase_char()
    {
        String password = "UDAy456";
        Assert.assertTrue(PasswordValidator.IsUpperCase(password));
    }
    @Test
    public void validation_password_having_one_lowercase_char() throws InvalidPasswordException {
        String password = "UDAy456";
        Assert.assertTrue(PasswordValidator.IsLowerCase(password));
    }
    @Test
    public void validation_password_having_one_number()
    {
        String password = "Uday6";
        Assert.assertTrue(PasswordValidator.IsNumber(password));
    }*/

}
