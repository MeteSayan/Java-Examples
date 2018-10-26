package com.info.standartprogramlamayapilari;

public class KarsilastirmaOperatoru {

    public static void main(String[] args) {
        int s1 = 40;
        int s2 = 50;

        int y1 = 90;
        int y2 = 80;

        boolean kontrol = s1==s2;

        System.out.println(kontrol);

        System.out.println(s1 >= s2);

        System.out.println(s1 < s2);

        System.out.println(s1 <= s2);

        System.out.println(s1 != s2);

        System.out.println(s1 > s2 && y1 > y2);

        System.out.println(s1 > s2 || y1 > y2);
    }
}
