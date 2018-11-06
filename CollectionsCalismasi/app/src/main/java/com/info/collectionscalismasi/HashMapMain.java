package com.info.collectionscalismasi;

import java.util.HashMap;
import java.util.Set;

public class HashMapMain {

    public static void main(String[] args) {

        HashMap<Integer,String> plakalar = new HashMap<>();

        plakalar.put(16, "Bursa");
        plakalar.put(34, "İstanbul");
        plakalar.put(6, "Ankara");

        System.out.println(plakalar.get(34));
        System.out.println(plakalar.get(16));

        Set<Integer> anahtarlar = plakalar.keySet();

        for (Integer i: anahtarlar){

            System.out.print(plakalar.get(i) + " - ");

        }

        HashMap<Integer,Ogrenci> nesneler = new HashMap<>();

        Ogrenci o1 = new Ogrenci(3333, "Ahmet");
        Ogrenci o2 = new Ogrenci(5555, "Mehmet");
        Ogrenci o3 = new Ogrenci(9999, "Ali");
        Ogrenci o4 = new Ogrenci(1111, "Zeynep");

        nesneler.put(o1.getOkulNo(), o1);
        nesneler.put(o2.getOkulNo(), o2);
        nesneler.put(o3.getOkulNo(), o3);
        nesneler.put(o4.getOkulNo(), o4);

        Set<Integer> okulNolari = nesneler.keySet();

        for (Integer no:okulNolari
             ) {

            System.out.println("*******");
            System.out.println("Öğrenci okul no: "+ nesneler.get(no).getOkulNo() );
            System.out.println("Öğrenci Adı: "+ nesneler.get(no).getIsim());

        }

    }



}
