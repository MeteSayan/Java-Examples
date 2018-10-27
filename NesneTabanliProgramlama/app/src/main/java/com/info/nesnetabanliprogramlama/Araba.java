package com.info.nesnetabanliprogramlama;

public class Araba {

    String renk;
    int hiz;
    double uzunluk;
    boolean calisiyorMu;

    //metod davranışı

    public void calistir(){
        calisiyorMu = true;

    }

    public void durdur(){
        calisiyorMu = false;
    }

    public void hızlan(int miktar){
        hiz = hiz + miktar;
    }

    public void yavasla(int miktar){
        hiz = hiz - miktar;
    }

}
