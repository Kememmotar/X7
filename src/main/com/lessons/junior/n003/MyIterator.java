package com.lessons.junior.n003;

import java.util.Iterator;

//LinkedList -
//Used E
//Create tests

public interface MyIterator<E> extends Iterator {

    @Override
    boolean hasNext();

    @Override
    E next();
}
