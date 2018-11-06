package com.info.collectionscalismasi;

import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args) {

        ArrayList<String> meyveler = new ArrayList<>();

        meyveler.add("elma");
        meyveler.add("muz");
        meyveler.add("portakal");

        System.out.println("Boyut: "+meyveler.size());

        System.out.println(meyveler.get(1));

        meyveler.add("erik");

        // meyveler.remove("muz");
        // meyveler.remove(1);

        meyveler.add(1, "mandalina");

        meyveler.set(3, "avakado");

        for (String s: meyveler
             ) {

            System.out.print(s + " - ");

        }


    }

}
