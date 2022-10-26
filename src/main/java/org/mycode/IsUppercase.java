package org.mycode;

import java.util.function.IntPredicate;

public class IsUppercase implements IntPredicate {
    @Override
    public boolean test(int asciiValue) {
        return (asciiValue >= 65 && asciiValue <= 90);
    }
}
