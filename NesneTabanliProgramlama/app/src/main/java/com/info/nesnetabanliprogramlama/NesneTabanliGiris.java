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

        /*System.out.println("BMW");
        System.out.println(bmw.renk);
        System.out.println(bmw.hiz);
        System.out.println(bmw.uzunluk);
        System.out.println(bmw.calisiyorMu);

        System.out.println("TOFAŞ");
        System.out.println(tofas.renk);
        System.out.println(tofas.hiz);
        System.out.println(tofas.uzunluk);
        System.out.println(tofas.calisiyorMu);*/

        Araba reno = new Araba();

        reno.renk = "Sarı";
        reno.hiz = 150;
        reno.uzunluk = 3.67;
        reno.calisiyorMu = true;

        /*System.out.println("BMW çalışma: " + bmw.calisiyorMu);
        System.out.println("TOFAŞ çalışma: " + tofas.calisiyorMu);
        System.out.println("RENO çalışma: " + reno.calisiyorMu);

        tofas.calistir();
        reno.durdur();

        System.out.println("BMW çalışma: " + bmw.calisiyorMu);
        System.out.println("TOFAŞ çalışma: " + tofas.calisiyorMu);
        System.out.println("RENO çalışma: " + reno.calisiyorMu);*/

        System.out.println(bmw.hiz);

        bmw.hızlan(30);

        System.out.println(bmw.hiz);

        bmw.yavasla(90);

        System.out.println(bmw.hiz);

        System.out.println(tofas.hiz);

        tofas.hızlan(100);

        System.out.println(tofas.hiz);

    }

}
