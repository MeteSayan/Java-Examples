package com.info.javaoopodevler;

import java.util.Scanner;

public class DilekceTaslak {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);
        Siniflar giris = new Siniflar();

        System.out.println("Öğrencinin adını giriniz.");
        String ogrenciAdi = tarayici.next();
        System.out.println("Öğrencinin numarasını giriniz.");
        int no = tarayici.nextInt();
        System.out.println("Öğrencinin izin günü sayısını giriniz.");
        int izinGun = tarayici.nextInt();
        System.out.println("Tarih giriniz.");
        String tarih = tarayici.next();
        System.out.println("Velinin adını ve soyadını giriniz.");
        String veliAdi = tarayici.next();

        giris.dilekceOlustur(ogrenciAdi, no, izinGun, tarih, veliAdi);
    }

}
