package com.info.nesnetabanliprogramlama.main;

import com.info.nesnetabanliprogramlama.object.Islemler;

public class IslemlerMain {

    public static void main(String[] args) {

        Islemler i = new Islemler();

        double sonuc = i.ortalamaHesaplama(4,6,46,7,56,86,90);

        System.out.println(sonuc);

    }

}
