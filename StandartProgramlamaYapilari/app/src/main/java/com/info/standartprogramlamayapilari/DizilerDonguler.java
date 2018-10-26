package com.info.standartprogramlamayapilari;

public class DizilerDonguler {

    public static void main(String[] args) {

        String sehirler[] = {"Bursa","İzmir","Ankara","İstanbul"};

        System.out.println(sehirler[0]);
        System.out.println(sehirler[1]);
        System.out.println(sehirler[2]);
        System.out.println(sehirler[3]);

        for (int i = 0 ; i < 4 ;i++){
            System.out.println(sehirler[i]);
        }

        String markalar[] = {"apple","google","hp"};

        int boyut = markalar.length;

        for (int i=0; i < boyut ; i++){
            System.out.println(markalar[i]);
        }

        String isimler [] = {"ahmet","mehmet","ayşe","murat"};

        for (String s:isimler){
            System.out.println(s);
        }

        int sayilar [] = {30,24,123,54,76};

        for (int sayi : sayilar){
            System.out.println(sayi);
        }



    }

}
