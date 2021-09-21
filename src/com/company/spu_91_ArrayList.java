package com.company;

import java.util.*;

public class spu_91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(9);
        a.add(8);
        a.add(0,5);

        System.out.println(a.contains(3));
        System.out.println(a.indexOf(9));

        for (int i = 0 ; i<a.size();i++){
            System.out.println(a.get(i));
            System.out.print(", ");
        }

    }
}
