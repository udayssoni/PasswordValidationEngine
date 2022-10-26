package org.mycode;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PasswordValidationTest {


    private PasswordValidator checker = PasswordValidator.build();

    @Test
    public void longer_than_8_characters() {
        Assertions.assertTrue(checker.isValid("1234567A"));
        Assertions.assertFalse(checker.isValid("1234567"));
    }
 //   @Test
    public void validation_password_having_one_uppercase_char ()  throws InvalidPasswordException
    {
        Assertions.assertTrue(checker.isValid("1234567A"));;
        Assertions.assertFalse(checker.isValid("1234567a"));;

    }
  //  @Test
    public void validation_password_having_one_lowercase_char() throws InvalidPasswordException {
        Assertions.assertTrue(checker.isValid("1234567a"));;
        Assertions.assertFalse(checker.isValid("1234567A"));;
    }

   // @Test
    public void validation_password_having_one_number()  throws InvalidPasswordException
    {
        Assertions.assertTrue(checker.isValid("1234567A"));;
        Assertions.assertFalse(checker.isValid("ANCBDGF"));;
    }

}
