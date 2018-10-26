package com.info.standartprogramlamayapilari;

import java.util.Scanner;

public class DizilerKarne {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);

        String dersler[] = new String[3];

        int notlar[] = new int[3];

        for (int i = 0 ; i < dersler.length ; i++){
            System.out.println((i+1) + ". dersi giriniz");
            String ders = tarayici.next();

            dersler[i] = ders;

            System.out.println((i + 1)+ ". dersin notunu giriniz");
            int not = tarayici.nextInt();

            notlar[i] = not;

        }

        int toplam = 0;

        for (int k=0;k < notlar.length; k++){

            System.out.println(dersler[k] +" : " +notlar[k]);
            toplam = toplam +notlar[k];
        }

        int ortalama = toplam / notlar.length;

        System.out.println("Ortalama : "+ortalama);

        if (ortalama>=50){
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }
        else {
            System.out.println("Sınıfta kaldınız.");
        }

    }

}
