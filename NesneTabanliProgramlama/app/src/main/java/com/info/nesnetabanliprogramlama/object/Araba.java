package com.info.nesnetabanliprogramlama.object;

public class Araba {

    public String renk;
    public int hiz;
    public double uzunluk;
    public boolean calisiyorMu;

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
