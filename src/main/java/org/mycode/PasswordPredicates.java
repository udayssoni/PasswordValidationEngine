package org.mycode;

import java.util.function.IntPredicate;

public class PasswordPredicates
{
    public static IntPredicate isUppercase(){
        return new IsUppercase();
    }

    public static IntPredicate isLowercase(){
        return new IsLowerCase();
    }


}
