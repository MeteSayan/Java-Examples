package com.hp.degiskenler;

public class AritmetikIslemler {

    public static void main(String[] args) {
        // Daire alanı
        double daireAlani;
        double pi = 3.14;
        int yariCap = 2;
        daireAlani = pi * yariCap * yariCap;

        System.out.println(daireAlani);

        //Kuvvet Bulma
        int kuvvet;
        int kutle = 67;
        int ivme = 10;

        kuvvet = kutle * ivme;

        System.out.println("Kuvvet: " + kuvvet);

        //Formül
        int x1,x2 ;

        int v = 30;
        int v0 = 40;
        int t = 5;
        int a = 2;

        x1 = ((v + v0)/2);

        System.out.println("X: "+x1);

        x2 = (v0 * t) + (a * t * t)/2;

        System.out.println("X2: "+x2);

        int toplam = 80;

        toplam += 20;

        System.out.println("Toplam: "+toplam);

        int carpma = 30;
        carpma *= 50 ;

        System.out.println("Çarpma: "+carpma);

        int sayi1 = 4;
        int sayi2 = ++sayi1;
        int sayi3 = --sayi1;

        System.out.println("Sayi1: "+sayi1);
        System.out.println("Sayi2: "+sayi2);
        System.out.println("Sayi3: "+sayi3);

        int k = 10;

        int l = k++;

        int z = k--;

        System.out.println("k: "+k);
        System.out.println("l: "+l);
        System.out.println("z: "+z);
    }

}
