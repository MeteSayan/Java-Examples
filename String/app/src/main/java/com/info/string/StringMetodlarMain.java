package com.info.string;

public class StringMetodlarMain {

    public static void main(String[] args) {

        String s1 = "Merhaba Ali";

        System.out.println(s1.charAt(8));
        System.out.println(s1.length());
        System.out.println(s1.replace("a", "ö"));
        System.out.println(s1.substring(3,7));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim()); // Boşlukları siler
        String [] dizi = s1.split("a");

        for (String s:dizi){

            System.out.println(s);

        }








    }

}
