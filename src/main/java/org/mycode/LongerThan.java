package org.mycode;

public class LongerThan implements Rule {
    private int size;

    public LongerThan(int size) {
        this.size = size;
    }

    @Override
    public boolean IsMatched(String string) {

        return string.length() >= size;
    }

}
