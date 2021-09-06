package com.lessons.junior.n002;

public class MyStringIterator implements MyIterator {

    private int currentElement = 0;
    private String[] strings;

    public MyStringIterator(String[] strings) {
        this.strings = strings;
    }

    @Override
    public boolean hasNext() {
        return currentElement < strings.length;
    }

    @Override
    public String next() {
        if (hasNext()) {
            return strings[currentElement++];
        }
        return null;
    }
}
