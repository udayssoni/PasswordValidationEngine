package org.mycode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsNumericTest {

    @Test
    public void test() {

        ValidationResponse validationResponse = new ContainsNumeric().isMatched("1");
        Assertions.assertTrue(validationResponse.isValidationStatus());

        ValidationResponse validationResponse1 = new ContainsNumeric().isMatched("a");
        Assertions.assertFalse(validationResponse1.isValidationStatus());

    }

}
