package com.info.standartprogramlamayapilari;

import java.util.Arrays;

public class Diziler {

    public static void main(String[] args) {

        int plakalar[] = new int [5];

        plakalar[0] = 34;
        plakalar[3] = 16;
        plakalar[2] = 65;

        //System.out.println(Arrays.toString(plakalar));

        String[] meyveler = {"elma","muz","vişne","armut","karpuz"};
        double[] boylar = {1.78,1.92,1.55,1.81};

        System.out.println(meyveler[2]);

        double boy = boylar[3];

        System.out.println(boy);

        System.out.println(Arrays.toString(meyveler));

        meyveler[3] = "portakal";
        System.out.println(Arrays.toString(meyveler));

    }

}
