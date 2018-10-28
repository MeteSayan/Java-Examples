package com.info.nesnetabanliprogramlama.main;

import com.info.nesnetabanliprogramlama.object.Matematik;

public class MatematikMain {

    public static void main(String[] args) {

        Matematik m1 = new Matematik();

        m1.carpma(3,2);

        int gelenDeger = m1.topla(3,5,6);

        System.out.println("Toplam : " + gelenDeger);

        int cikarmaSonuc = m1.cikarma(10,5 ,"Mete" );

        System.out.println("Çıkarma : "+ cikarmaSonuc);
    }

}
