package com.info.javaoopodevler;

import java.util.Scanner;

public class IcAciToplami {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);
        Siniflar a = new Siniflar();

        System.out.println("Kenar sayısı giriniz.");
        int kenarSayisi = tarayici.nextInt();

        System.out.println(a.icAciToplami(kenarSayisi));
    }

}
