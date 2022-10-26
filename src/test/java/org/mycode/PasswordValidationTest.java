package org.mycode;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationTest {

    private PasswordValidator checker = PasswordValidator.build() ;

    @Test
    public void test3Condition(){

       Assertions.assertTrue(checker .isValid("ABCDabcd"));
       Assertions.assertTrue(checker .isValid("abcdabcdA"));
       Assertions.assertTrue(checker .isValid("abcdabcd1"));

       //3.	Add feature: password is never OK if item 1.d is not true.
        Assertions.assertFalse(checker .isValid("ABCD1ABCD"));
        Assertions.assertFalse(checker .isValid("121"));



    }


}
