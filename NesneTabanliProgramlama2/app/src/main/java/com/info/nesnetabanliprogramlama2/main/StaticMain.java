package com.info.nesnetabanliprogramlama2.main;

import com.info.nesnetabanliprogramlama2.objects.Matematik;
import com.info.nesnetabanliprogramlama2.objects.Personel;

public class StaticMain {

    public static void main(String[] args) {

        int sonuc = Matematik.topla(3,6);

        //System.out.println(sonuc);

        Personel p1 = new Personel("Ahmet",23);
        Personel p2 = new Personel("Mehmet",70);
        Personel p3 = new Personel("Can",17);
        Personel p4 = new Personel("Merve",29);


        System.out.println(Personel.sayac);

    }

}
