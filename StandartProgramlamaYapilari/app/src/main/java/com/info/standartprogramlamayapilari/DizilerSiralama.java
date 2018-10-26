package com.info.standartprogramlamayapilari;

import java.util.Arrays;

public class DizilerSiralama {

    public static void main(String[] args) {

        String isimler[] = {"zeynep","ali","ayhan","murat","yeşim"};

        for (String s:isimler) {
            System.out.println(s);
        }

        Arrays.sort(isimler);

        for (String x:isimler) {
            System.out.println(x);
        }

        int sayilar [] = {20,40,10,55,4};

        Arrays.sort(sayilar);

        for (int z:sayilar
             ) {
            System.out.println(z);
        }

    }

}
