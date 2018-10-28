package com.info.javaoopodevler;

public class Siniflar {

    public void sicaklikDonusum (double sayi1){

        double f;

        f = ((sayi1 * 1.8) + 32);

        System.out.println("Fahrenhiet: " + f);

    }

    public double cevreHesabi (double kisaKenar,double uzunKenar){

        double cevre;

        cevre = (2 * kisaKenar) + (2 * uzunKenar);

        return cevre;
    }

    public int faktoriyelHesapla(int sayi){

        int toplam = 1;
        int i;

        if (sayi == 0){
            toplam = 1;
        }else {
            for (i = 1; i <= sayi; i++) {

                toplam *= i;

            }
        }
        return toplam;
    }

}
