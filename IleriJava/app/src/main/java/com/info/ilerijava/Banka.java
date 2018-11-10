package com.info.ilerijava;

public class Banka {

    private int bakiye;

    public Banka() {
    }

    public Banka(int bakiye) {
        this.bakiye = bakiye;
    }

    public synchronized void paraCek(String isim,int tutar){

        if (tutar > bakiye){
            System.out.println(isim + ": Hesapta para kalmadı.");
        }
        else{
            bakiye = bakiye - tutar;
            System.out.println(isim + ": Hesapta kalan para "+bakiye);
        }

    }

}