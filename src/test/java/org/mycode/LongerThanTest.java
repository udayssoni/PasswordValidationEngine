package org.mycode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongerThanTest {

    @Test
    public void test() {
        ResponseObject responseObject = new LongerThan(8).isMatched("1234567890");
        Assertions.assertTrue(responseObject.isValidationStatus());

        ResponseObject responseObject1 = new LongerThan(8).isMatched("1");
        Assertions.assertFalse(responseObject1.isValidationStatus());


    }
}
