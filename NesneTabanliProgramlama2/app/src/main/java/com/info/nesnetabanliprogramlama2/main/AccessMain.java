package com.info.nesnetabanliprogramlama2.main;

import com.info.nesnetabanliprogramlama2.object.Ogrenciler;
import com.info.nesnetabanliprogramlama2.object.Urunler;

public class AccessMain {

    public static void main(String[] args) {

        Ogrenciler o1 = new Ogrenciler();

        o1.setIsim("Ahmet");
        o1.setOkulNo(1234);

        o1.bilgiAl();

        System.out.println(o1.getIsim());
        int on = o1.getOkulNo();

        System.out.println(on);

        Urunler u = new Urunler("Telefon", 30);

        System.out.println(u.getUrunAd());
        System.out.println(u.getUrunAdet());

    }

}
