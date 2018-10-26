package com.info.standartprogramlamayapilari;

public class DongulerSinirDegerOrnekler {

    public static void main(String[] args) {

        // örnek 1 : 3 - 6 --> 3-4-5-6

        for (int k = 3 ; k < 7 ; k++){
            System.out.println("k değer: "+k);
        }

        int a = 3;

        while (a < 7){
            System.out.println("a değer: "+a);
            a++;
        }

        //örnek 2 : 0 - 8 --> 0,2,4,6,8

        for (int z = 0 ; z < 9; z+=2){
            System.out.println("z değer: "+z);
        }

        int n = 0;

        while (n < 9){
            System.out.println("n değer: "+n);
            n = n +2;
        }
    }

}
