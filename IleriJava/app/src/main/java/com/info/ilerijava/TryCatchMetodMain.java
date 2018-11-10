package com.info.ilerijava;

public class TryCatchMetodMain {

    public static void main(String[] args) {

        Hesaplayici h = new Hesaplayici();

        try {
            h.bol(3, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
