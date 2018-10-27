package com.info.nesnetabanliprogramlama;

public class NesneTabanliGiris {

    public static void main(String[] args) {

        //normal değişken
        int yas = 30;
        //nesne oluşturma
        Araba bmw = new Araba();

        bmw.renk = "Kırmızı";
        bmw.hiz = 200;
        bmw.uzunluk = 2.05;
        bmw.calisiyorMu = true;

        Araba tofas = new Araba();

        tofas.renk = "Beyaz";
        tofas.hiz = 100;
        tofas.uzunluk = 2.47;
        tofas.calisiyorMu = false;

        System.out.println("BMW");
        System.out.println(bmw.renk);
        System.out.println(bmw.hiz);
        System.out.println(bmw.uzunluk);
        System.out.println(bmw.calisiyorMu);

        System.out.println("TOFAŞ");
        System.out.println(tofas.renk);
        System.out.println(tofas.hiz);
        System.out.println(tofas.uzunluk);
        System.out.println(tofas.calisiyorMu);

    }

}
