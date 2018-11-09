package com.info.collectionscalismasi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayListSayiUretipSiralama {

    public static void main(String[] args) {

        ArrayList<Integer> sayilar = new ArrayList();
        Random r = new Random();

        for (int i = 0; i <=100; i++){
            int sayi = r.nextInt(101);
            sayilar.add(sayi);

        }

        Collections.sort(sayilar);

        for (Integer s:sayilar
             ) {
            System.out.println(s);
        }



    }




}
