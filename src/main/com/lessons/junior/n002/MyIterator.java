package com.lessons.junior.n002;

import java.util.Iterator;

public interface MyIterator extends Iterator<String> {

    @Override
    boolean hasNext();

    @Override
    String next();
}
