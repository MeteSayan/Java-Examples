package com.info.nesnetabanliprogramlama2.object;

public class Urunler {

    private String urunAd;
    private int urunAdet;

    public Urunler(String urunAd, int urunAdet) {
        this.urunAd = urunAd;
        this.urunAdet = urunAdet;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public int getUrunAdet() {
        return urunAdet;
    }

    public void setUrunAdet(int urunAdet) {
        this.urunAdet = urunAdet;
    }


}
