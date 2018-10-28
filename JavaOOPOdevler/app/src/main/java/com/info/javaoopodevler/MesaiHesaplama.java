package com.info.javaoopodevler;

import java.util.Scanner;

public class MesaiHesaplama {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);
        Siniflar x = new Siniflar();

        System.out.println("Çalıştığınız gün sayısını giriniz.");
        int calistigiGun = tarayici.nextInt();

        System.out.println(x.maasHesapla(calistigiGun) + " TL maaş alacaksınız.");


    }

}
