package com.lessons.junior.n002;

public interface MyList extends Iterable<String> {

  void clear();

  int size();

  boolean isEmpty();

  boolean contains(String var);

  boolean add(String string);

  boolean remove(String var);

  MyIterator iterator();

}
