package com.info.standartprogramlamayapilari;

import java.util.Scanner;

public class IfElseIfDortIslem {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);

        System.out.println("Hesap seçiniz");
        System.out.println("(1) Toplama");
        System.out.println("(2) Çıkarma");
        System.out.println("(3) Çarpma");
        System.out.println("(4) Bölme");

        int tercih = tarayici.nextInt();

        System.out.println("Birinci sayıyı giriniz");
        int s1 = tarayici.nextInt();

        System.out.println("İkinci sayıyı giriniz");
        int s2 = tarayici.nextInt();

        if (tercih == 1){
            System.out.println("Toplama: "+ (s1 + s2));
        }
        else if(tercih == 2){
            System.out.println("Çıkarma: "+ (s1 - s2));
        }
        else if(tercih == 3){
            System.out.println("Çarpma: "+ (s1 * s2));
        }
        else if(tercih == 4){
            System.out.println("Bölme: "+ (s1 / s2));
        }
    }

}
