package org.mycode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongerThanTest {

    @Test
    public void test() {
        Assertions.assertTrue(new LongerThan(8).IsMatched("1234567890"));
        Assertions.assertFalse(new LongerThan(8).IsMatched("1"));
    }
}
