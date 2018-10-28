package com.info.javaoopodevler;

import java.util.Scanner;

public class FaktöriyelHesabi {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);

        Siniflar x = new Siniflar();

        System.out.println("Faktöriyelini almak istediğiniz sayıyı giriniz.");
        int sayi = tarayici.nextInt();

        System.out.println(x.faktoriyelHesapla(sayi));


    }

}
