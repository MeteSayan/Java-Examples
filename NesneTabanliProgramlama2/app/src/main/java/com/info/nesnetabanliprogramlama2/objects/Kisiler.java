package com.info.nesnetabanliprogramlama2.objects;

public class Kisiler {

    private String isim;
    private int tel;
    private Adresler adres;

    public Kisiler() {
    }

    public Kisiler(String isim, int tel, Adresler adres) {
        this.isim = isim;
        this.tel = tel;
        this.adres = adres;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public Adresler getAdres() {
        return adres;
    }

    public void setAdres(Adresler adres) {
        this.adres = adres;
    }
}
