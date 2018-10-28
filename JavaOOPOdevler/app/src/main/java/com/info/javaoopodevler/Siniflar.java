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

    public void harfSayisiBul(String kelime, char harf){

        int boyut = kelime.length();

        char[] harfler = new char[boyut];

        for (int i = 0; i < boyut ; i++){

            harfler[i] = kelime.charAt(i);

        }

        int sayac = 0;

        for (int i = 0; i < boyut ; i++) {

            if (harfler[i] == harf){
                sayac++;
        }
        }
        System.out.println("Harf sayısı: "+sayac);
    }

    public int icAciToplami(int kenarSayisi){

        int toplam;

        toplam = (kenarSayisi - 2 )*(180);

        return toplam;


    }

    public void dilekceOlustur(String ogrenciAdi,int no,int izinGun,String tarih,String veliadi){

        System.out.println("\t\t Alaşehir Ahmet Altan Anadolu Lisesi Müdürlüğüne,");
        System.out.println(ogrenciAdi + " adlı " + no + " nolu öğrencinin " + izinGun + " gün izinli olmasını rica ediyorum.");
        System.out.println("Tarih: "+tarih);
        System.out.println("Ad-Soyad: "+ veliadi);

    }

    public int maasHesapla(int calistigiGun){

        int calismaSaati = 8 * calistigiGun;
        int asgariUcret = 1750 ;
        int mesaiUcreti = 10;

        if (calismaSaati > 160){

            int toplamMaas;

            toplamMaas = asgariUcret + (mesaiUcreti*(calismaSaati - 160));

            return toplamMaas;

        }else{
            return asgariUcret;
        }

    }

    public int internetUcretiHesapla(int kullanımMiktar){

        int tarife = 50;
        int tarifeFiyat = 100;

        if (kullanımMiktar > tarife){
            int toplamUcret;

            toplamUcret = tarifeFiyat + (4 * (kullanımMiktar - tarife));

            return toplamUcret;
        }
        else {
            return tarifeFiyat;
        }

    }

}
