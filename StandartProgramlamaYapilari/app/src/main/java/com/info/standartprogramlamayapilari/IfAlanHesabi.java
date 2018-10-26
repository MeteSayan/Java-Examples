package com.info.standartprogramlamayapilari;

import java.util.Scanner;

public class IfAlanHesabi {
    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);

        System.out.println("Alan hesabına hoşgeldiniz.");
        System.out.println("(1) Dikdörtgen alanı");
        System.out.println("(2) Çember alanı");

        int tercih = tarayici.nextInt();

        if (tercih == 1){

            System.out.println("Kısa kenar giriniz");
            int kısakenar = tarayici.nextInt();
            System.out.println("Uzun kenar giriniz");
            int uzunkenar = tarayici.nextInt();

            System.out.println("Sonuç: " +(kısakenar*uzunkenar));

        }

        if (tercih == 2){
            System.out.println("Yarı çap giriniz");
            int yariCap = tarayici.nextInt();

            System.out.println("Çember alanı: " + (3.14 * yariCap * yariCap));


        }




    }
}
