package com.info.androidalmayaps;

import java.io.Serializable;

public class Kisiler implements Serializable {

    private String isim;
    private int yas;
    private double boy;
    private boolean bekarMi;

    public Kisiler() {
    }

    public Kisiler(String isim, int yas, double boy, boolean bekarMi) {
        this.isim = isim;
        this.yas = yas;
        this.boy = boy;
        this.bekarMi = bekarMi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public boolean isBekarMi() {
        return bekarMi;
    }

    public void setBekarMi(boolean bekarMi) {
        this.bekarMi = bekarMi;
    }
}
