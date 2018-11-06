package com.info.collectionscalismasi;

import java.util.HashSet;

public class HashSetMain {

    public static void main(String[] args) {

        HashSet<String> meyveler = new HashSet<>();

        meyveler.add("elma");
        meyveler.add("muz");
        meyveler.add("erik");

        meyveler.remove("muz");

        meyveler.add("erik");

        for (String s: meyveler
             ) {
            System.out.print(s + " - ");
        }



    }



}
