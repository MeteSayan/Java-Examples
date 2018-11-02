package com.info.nesnetabanliprogramlama3.Objects;

public class Ogrenci {

    private int tcno;
    private String isim;

    public Ogrenci() {
    }

    public Ogrenci(int tcno, String isim) {
        this.tcno = tcno;
        this.isim = isim;
    }

    public int getTcno() {
        return tcno;
    }

    public void setTcno(int tcno) {
        this.tcno = tcno;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }


    @Override
    public String toString() {
        return "Öğrenci adı: " + isim + " tc no: "+tcno;
    }

    @Override
    public boolean equals(Object obj) {
        if (tcno == ((Ogrenci)obj).getTcno()){
            return true;
        }else{
            return false;
        }
    }
}
