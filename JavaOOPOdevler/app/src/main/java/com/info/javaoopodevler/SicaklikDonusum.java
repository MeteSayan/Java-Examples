package com.info.javaoopodevler;

import java.util.Scanner;

public class SicaklikDonusum {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);

        System.out.println("Sıcaklık değerini giriniz");

        Siniflar a = new Siniflar();

        a.sicaklikDonusum(tarayici.nextDouble());





    }

}
