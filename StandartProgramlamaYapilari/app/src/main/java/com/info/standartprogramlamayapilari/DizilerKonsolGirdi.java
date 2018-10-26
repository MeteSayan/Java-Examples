package com.info.standartprogramlamayapilari;

import java.util.Scanner;

public class DizilerKonsolGirdi {

    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);

        int [] sayilar = new int[5];

        for (int i = 0 ;i < sayilar.length ; i++){
            System.out.println((i+1) +". Sayı giriniz");
            int sayi = tarayici.nextInt();

            sayilar[i] = sayi;
        }

        for (int k:sayilar
             ) {
            System.out.println(k);
        }
    }

}
