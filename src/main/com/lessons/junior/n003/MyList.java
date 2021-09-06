package com.lessons.junior.n003;

public interface MyList<E> extends Iterable<E> {

  void clear();

  int size();

  boolean isEmpty();

  boolean contains(E var);

  boolean add(E string);

  boolean remove(E var);

  MyIterator<E> iterator();

}
