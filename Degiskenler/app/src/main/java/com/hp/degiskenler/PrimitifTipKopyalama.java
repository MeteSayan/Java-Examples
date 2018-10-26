package com.hp.degiskenler;

public class PrimitifTipKopyalama {

    public static void main(String[] args) {

        int sayi1 = 30 ; // sayi1 = 30

        int sayi2 = sayi1; // sayi2 = 30 , sayi1 = 30

        sayi1 = sayi1 +5; // sayi1 = 30 + 5 --> sayi1 = 35

        System.out.println(sayi1);
        System.out.println(sayi2);

        int x = 60; // x = 60

        int y = 50; // x = 50

        y = x; // y = 60 , x = 50

        x = 80;

        System.out.println(x);
        System.out.println(y);


    }

}
