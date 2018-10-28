package com.info.nesnetabanliprogramlama;

public class ConstructorMain {

    public static void main(String[] args){

        Ogrenciler ogrenci = new Ogrenciler();

        ogrenci.adres = "Ankara";
        ogrenci.isim = "Mehmet";
        ogrenci.okulNo = 1234;

        System.out.println(ogrenci.isim);

        Ogrenciler ogrenci2 = new Ogrenciler("ahmet",5678 , "İstanbul");

        System.out.println(ogrenci2.adres);
    }

}
