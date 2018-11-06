package com.info.collectionscalismasi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListNesneMain {

    public static void main(String[] args) {

        List<Ogrenci> nesneler = new ArrayList<>();

        Ogrenci o1 = new Ogrenci(3333, "Ahmet");
        Ogrenci o2 = new Ogrenci(5555, "Mehmet");
        Ogrenci o3 = new Ogrenci(9999, "Ali");
        Ogrenci o4 = new Ogrenci(1111, "Zeynep");


        nesneler.add(o1);
        nesneler.add(o2);
        nesneler.add(o3);
        nesneler.add(o4);

        Collections.sort(nesneler);

        for (Ogrenci o: nesneler){

            System.out.println("*******");
            System.out.println("Öğrenci Tc no: "+ o.getOkulNo());
            System.out.println("Öğrenci Adı: "+ o.getIsim());


        }


    }


}
