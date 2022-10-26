package org.mycode;

import java.util.function.IntPredicate;

public class IsLowerCase implements IntPredicate {
    @Override
    public boolean test(int asciiValue) {
        return (asciiValue >= 97 && asciiValue <= 122);
    }
}
