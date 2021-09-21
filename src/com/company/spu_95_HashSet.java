package com.company;

import java.util.HashSet;

public class spu_95_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> Hs = new HashSet<>(6,0.05f);
        Hs.add(6);
        Hs.add(5);
        Hs.add(4);
        Hs.add(3);
        System.out.println(Hs);
    }
}
