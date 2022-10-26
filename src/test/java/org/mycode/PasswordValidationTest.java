package org.mycode;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidationTest {

    @Test
    public void with_no_validation_all_password_will_be_fine()
    {
        String password = "uday";
        Assert.assertTrue(PasswordValidator.isValid(password));
    }


}
