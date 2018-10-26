package com.hp.degiskenler;

public class StringBirlestirme {

    public static void main(String[] args) {

        String yazi = "Mehmet";

        String sonuc = yazi + " merhaba";

        String str = "Kişinin adı : " + "Ahmet";

        int not = 80;

        String ders = "matematik";
        String ogrenciAdi = "Zeynep ";

        String metin = ogrenciAdi + ders + " sınavından " +not+" aldı.";

        int sayi1 = 50;
        int sayi2 = 40;

        System.out.println("Sayı 1: "+sayi1);
        System.out.println("Sayı 2: "+sayi2);
        System.out.println("Sonuç = "+(sayi1+sayi2));
        System.out.println(str);
        System.out.println(sonuc);
        System.out.println(metin);

    }

}
