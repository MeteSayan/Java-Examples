package com.hp.degiskenler;


import java.util.Scanner;

public class KonsolGirdisi {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz...");
        String gelenAd = tarayici.next();

        System.out.println("Yaşınızı giriniz...");
        int gelenYas = tarayici.nextInt();

        System.out.println("Boyunuzu giriniz...");
        double gelenBoy = tarayici.nextDouble();

        System.out.println("Evli misiniz...");
        boolean evliMi = tarayici.nextBoolean();

        System.out.println("Ad: "+gelenAd);
        System.out.println("Yaş: "+gelenYas);
        System.out.println("Boy: "+gelenBoy);
        System.out.println("Evli mi: "+evliMi);

    }

}
