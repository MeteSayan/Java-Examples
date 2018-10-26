package com.hp.degiskenler;

public class TurDonusumu {

    public static void main(String[] args) {

        double d = 23.56;
        long l = (long)d;
        int i = (int)l;

        System.out.println("Double deger: "+d);
        System.out.println("Long deger: "+l);
        System.out.println("Integer deger: "+i);


        int x = 67;
        long y = x;
        double z = y;

        System.out.println("X değer: "+x);
        System.out.println("Y değer: "+y);
        System.out.println("Z değer: "+z);
        //Sayıdan stringe dönüşüm
        int sayi = 56;
        String yazi1 = String.valueOf(sayi);

        System.out.println(yazi1);
        //Stringden sayıya dönüşüm
        String metin = "65";

        int sayi1 = Integer.parseInt(metin);
        System.out.println(sayi1);

    }

}
