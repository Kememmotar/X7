package com.geecko;

import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Implement method getResult
     */
    public static List<Integer> getResult(List<Integer> numb) {
        for (int i = 0; i < 3; i++) {
            System.out.println((double)i);
        }
        numb.removeIf(n -> (n <= 2));
        return numb;
    }

    public static void main(String[] args) {

        List<Integer> mm = new ArrayList<Integer>();
        mm.add(1);
        mm.add(2);
        mm.add(3);
        System.out.println(getResult(mm));
    }
}