package com.info.collectionscalismasi;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListSayiTahmin {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);
        Random sayi = new Random();

        int number = sayi.nextInt(101);

        // System.out.println(number);

        ArrayList<Integer> tahminler = new ArrayList<>();

        System.out.println("Sayı tahmin oyununa hoşgeldiniz.");
        System.out.println("Sadece 5 hakkınız vardır. Bol şans.");

        for (int i = 0; i < 5;i++){
            System.out.println("----------------------");
            System.out.println((i+1) +". tahmininizi giriniz.");
            int tahmin = tarayici.nextInt();
            tahminler.add(i,tahmin);

            if (number == tahmin ){
                System.out.println("Tebrikler Sayıyı doğru tahmin ettiniz");
                break;
            }
            else if (number > tahmin){
                System.out.println("Tahmininiz yanlış. Cevap daha büyük bir sayı.");
            }
            else if (number < tahmin){
                System.out.println("Tahmininiz yanlış. Cevap daha küçük bir sayı.");
                }


        }

        System.out.println("----------------------");
        System.out.println("Tahminleriniz");
        for (Integer s:tahminler
             ) {
            System.out.println(s);
        }

        System.out.println("Cevap = " + number);




    }




}
