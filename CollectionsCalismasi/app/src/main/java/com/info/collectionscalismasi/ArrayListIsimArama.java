package com.info.collectionscalismasi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListIsimArama {

    public static void main(String[] args) {

        ArrayList<String> isimler = new ArrayList<>();

        Scanner tarayici = new Scanner(System.in);

        isimler.add(0, "Ahmet");
        isimler.add(1, "Ali");
        isimler.add(2, "Ekin");
        isimler.add(3, "Murat");
        isimler.add(4, "Deniz");

        System.out.println("Lütfen aratmak istediğiniz ismi giriniz");
        String girilenIsim = tarayici.next();


        for (String s:isimler){
            if (s.equalsIgnoreCase(girilenIsim)){
            System.out.println("Girilen isim kayıtlıdır.");
            break;
            } else {
            System.out.println("Girilen isim kayıtlı değildir.");
            break;
            }
        }
    }



}
