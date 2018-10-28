package com.info.nesnetabanliprogramlama.object;

public class Matematik {

    public void carpma(int sayi1,int sayi2){

         int sonuc = sayi1 * sayi2;
        System.out.println(sonuc);

    }

    public int topla(int sayi1,int sayi2,int sayi3){

         int toplam = sayi1 + sayi2 + sayi3;

        return toplam;
    }

    public int cikarma(int sayi1 , int sayi2 , String isim){

        int cikarmaSonuc = sayi1 - sayi2;

        System.out.println("İşlem yapan: " + isim);

        return cikarmaSonuc;
    }
}
