package com.info.ilerijava;

public class Hesaplayici {

    public int bol(int sayi1, int sayi2) throws Exception{
        if (sayi2 == 0) throw new Exception("Sıfıra bölünemez.");

        return sayi1/sayi2;
    }

}
