package com.info.string;

import java.util.Scanner;

public class TerstenYazMain {

    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Lütfen kelime giriniz.");
        String gelenkelime = tarayici.next();

        int boyut = gelenkelime.length();

        char [] dizi = new char[boyut];

        for (int i = 0 ; i < boyut ; i++){
            dizi[i] = gelenkelime.charAt(i);
        }

        for (int i = boyut - 1 ; i >= 0 ; i--){

            System.out.print(dizi[i]);

        }

    }


}
