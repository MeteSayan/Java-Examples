package com.info.collectionscalismasi;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulKayitOrnek {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);

        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

        while (true){

            System.out.println("Öğrenci okul no giriniz");
            int no = tarayici.nextInt();

            System.out.println("Öğrenci ismini giriniz");
            String isim = tarayici.next();

            Ogrenci yeniOgrenci = new Ogrenci(no,isim);

            ogrenciler.add(yeniOgrenci);


            System.out.println("Çıkış 1 - Devam diğer sayılar");

            int secim = tarayici.nextInt();
            if (secim == 1){

                for (Ogrenci o:ogrenciler){
                    System.out.println("-----------");
                    System.out.println("Okul no: " + o.getOkulNo());
                    System.out.println("Öğrenci isim: " + o.getIsim());

                }

                break;
            }

        }





    }



}
