package com.info.nesnetabanliprogramlama.object;

public class Islemler {

    public double ortalamaHesaplama(double... sayilar){

        double toplam = 0;

        for (Double d:sayilar) {
            toplam = toplam + d;
        }

        return toplam / sayilar.length;

    }

}
