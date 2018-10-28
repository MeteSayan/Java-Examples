package com.info.javaoopodevler;

import java.util.Scanner;

public class InternetUcretiHesaplama {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);
        Siniflar x = new Siniflar();

        System.out.println("İnternet kullanım miktarınız giriniz.");
        int kullanim = tarayici.nextInt();

        System.out.println(x.internetUcretiHesapla(kullanim));

    }

}
