package com.info.nesnetabanliprogramlama2.object;

public class Renkler {

    public static final int Beyaz = 1111;
    public static final int Siyah = 0000;
    public static final int Kİirmizi = 3333;

    public void boya(int renkTercihi){
        if (renkTercihi == 1111){
            System.out.println("Beyaza boyandı");
        }
        if (renkTercihi == 0000){
            System.out.println("Siyaha boyandı");
        }
        if (renkTercihi == 3333){
            System.out.println("Kırmızıya boyandı");
        }
    }

}
