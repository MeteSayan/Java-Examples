package com.info.collectionscalismasi;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonelSistemi {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);
        ArrayList<Personel> personels = new ArrayList<>();


        for (int i=0; i < 5; i++){

            System.out.println((i+1) +". Personel ismi giriniz");
            String isim = tarayici.next();
            System.out.println((i+1) + ". Personel il giriniz");
            String il = tarayici.next();
            System.out.println((i+1) + ". Personel ilçe giriniz");
            String ilce = tarayici.next();

            Adres yeniAdres = new Adres(il,ilce);

            Personel yeniPersonel = new Personel(i+1,isim,yeniAdres);

            personels.add(yeniPersonel);

        }

        for (Personel p: personels
             ) {

            System.out.println("--------------------------");
            System.out.println("Personel no:" + p.getPersonelNo());
            System.out.println("Personel isim:" + p.getIsim());
            System.out.println("--------Adres---------");
            System.out.println("Personel il:" + p.getAdres().getIl());
            System.out.println("Personel ilçe:" + p.getAdres().getIlce());

        }

    }


}
