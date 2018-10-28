package com.info.javaoopodevler;

import java.util.Scanner;

public class CevreHesabi {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);

        Siniflar a = new Siniflar();

        System.out.println("Kısa kenar uzunluğunu giriniz.");
        double kisaKenar = tarayici.nextDouble();
        System.out.println("Uzun kenar uzunluğunu giriniz.");
        double uzunKenar = tarayici.nextDouble();

        double toplam = a.cevreHesabi(kisaKenar,uzunKenar );

        System.out.println("Sonuç: "+ toplam);
    }

}
