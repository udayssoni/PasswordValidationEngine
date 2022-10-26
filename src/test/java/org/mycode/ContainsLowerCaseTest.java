package org.mycode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsLowerCaseTest {

    @Test
    public void testLowerCase(){

        ValidationResponse validationResponse = new ContainsLowerCaseChars().isMatched("a1234567890");
        Assertions.assertTrue(validationResponse.isValidationStatus());

        ValidationResponse validationResponse1 = new ContainsLowerCaseChars().isMatched("1234567890");
        Assertions.assertFalse(validationResponse1.isValidationStatus());

    }
}
