package org.mycode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongerThanTest {

    @Test
    public void test() {
        ValidationResponse validationResponse = new LongerThan(8).isMatched("1234567890");
        Assertions.assertTrue(validationResponse.isValidationStatus());

        ValidationResponse validationResponse1 = new LongerThan(8).isMatched("1");
        Assertions.assertFalse(validationResponse1.isValidationStatus());


    }
}
