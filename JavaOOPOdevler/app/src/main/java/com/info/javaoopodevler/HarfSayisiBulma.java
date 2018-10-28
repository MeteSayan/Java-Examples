package com.info.javaoopodevler;

import java.util.Scanner;

public class HarfSayisiBulma {

    public static void main(String args[]){

        Scanner tarayici = new Scanner(System.in);

        System.out.println("Kelime giriniz.");
        String kelime = tarayici.next();

        System.out.println("Harf giriniz");
        char harf = tarayici.next().charAt(0);

        Siniflar a = new Siniflar();

        a.harfSayisiBul(kelime, harf);
    }

}
