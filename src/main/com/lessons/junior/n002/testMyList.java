package com.lessons.junior.n002;

public class testMyList {
    public static void main(String[] args) {
        MyList list = new MyStringList();
        System.out.println(list.isEmpty());
        list.add("First string");
        list.add("Second string");
        list.add("3th string");
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println("list.contains " + list.contains("Second string"));
        list.remove("Second string");
        System.out.println("list.contains " + list.contains("Second string"));
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println("----------------");

        list.add("First string");
        list.add("Second string");
        list.add("3th string");
        MyIterator myIterator = list.iterator();
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
        /*for (String string : list) {
            System.out.println(string);
        }*/
    }
}
