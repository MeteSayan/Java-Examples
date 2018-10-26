package com.info.standartprogramlamayapilari;

import java.util.Scanner;

public class DongulerIsımTekrar {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);

        System.out.println("İsminizi giriniz");
        String isim = tarayici.nextLine();

        System.out.println("Tekrarlanma miktarı giriniz");
        int sayi = tarayici.nextInt();

        for (int i = 0; i < sayi ; i++){
            System.out.println(isim + " - " + (i+1));
        }

    }

}
