package com.lessons.junior.n003;

public class test {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyEList<>();
        myList.add(456);
        myList.add(777);
        myList.add(851);
        System.out.println(myList.size());
        System.out.println("contains = " + myList.contains(777));
        myList.remove(851);
        System.out.println(myList.size());
        for (Integer elementsList : myList) {
            System.out.println(elementsList);
        }
        myList.remove(1);
        System.out.println(myList.size());
        for (Integer elementsList : myList) {
            System.out.println(elementsList);
        }
        myList.remove(777);
        System.out.println(myList.size());
        for (Integer elementsList : myList) {
            System.out.println(elementsList);
        }
        myList.remove(456);
        System.out.println(myList.size());
        for (Integer elementsList : myList) {
            System.out.println(elementsList);
        }
        myList.remove(3);
        System.out.println(myList.size());
        for (Integer elementsList : myList) {
            System.out.println(elementsList);
        }
    }

}
