package com.info.nesnetabanliprogramlama3.Main;

import com.info.nesnetabanliprogramlama3.Objects.Ogrenci;

public class EqualsToStringMain {

    public static void main(String[] args) {

        Ogrenci o1 = new Ogrenci(8888,"Ahmet" );
        Ogrenci o2 = new Ogrenci(6666,"Mehmet" );
        Ogrenci o3 = new Ogrenci(8888,"Ayşe" );
        Ogrenci o4 = new Ogrenci(7777,"Zeynep" );
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);

        if (o1.equals(o3)){
            System.out.println("Eşit.");
        }
        else{
            System.out.println("Eşit değil.");
        }


    }

}
