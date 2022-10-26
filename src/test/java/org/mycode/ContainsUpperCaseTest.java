package org.mycode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsUpperCaseTest {
    @Test
    public void testUpperCase(){

        ValidationResponse validationResponse = new ContainsUpperCaseChars().isMatched("A1234567890");
        Assertions.assertTrue(validationResponse.isValidationStatus());

        ValidationResponse validationResponse1 = new ContainsUpperCaseChars().isMatched("1234567890");
        Assertions.assertFalse(validationResponse1.isValidationStatus());

    }
}
