package org.mycode;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidationTest {

    @Test
    public void with_no_validation_all_password_will_be_fine()
    {
        String password = "";
        Assert.assertTrue(PasswordValidator.isValid(password));
    }

    @Test
    public void validation_password_length_longer_then_8_characters()
    {
        String password = "uday1234567";
        Assert.assertTrue(PasswordValidator.isValid(password));
    }

    @Test
    public void validation_password_length_not_longer_then_8_characters()
    {
        String password = "uday456";
        Assert.assertFalse(PasswordValidator.isValid(password));
    }
    @Test
    public void validation_password_having_one_uppercase_char()
    {
        String password = "UDAy456";
        Assert.assertTrue(PasswordValidator.IsUpperCase(password));
    }
    @Test
    public void validation_password_having_one_lowercase_char()
    {
        String password = "UDAy456";
        Assert.assertTrue(PasswordValidator.IsLowerCase(password));
    }
    @Test
    public void validation_password_having_one_number()
    {
        String password = "Uday6";
        Assert.assertTrue(PasswordValidator.IsNumber(password));
    }

}
