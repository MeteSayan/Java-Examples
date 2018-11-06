package com.info.collectionscalismasi;

public class Ogrenci implements  Comparable<Ogrenci>{

    private int okulNo;
    private String isim;

    public Ogrenci() {
    }

    public Ogrenci(int okulNo, String isim) {
        this.okulNo = okulNo;
        this.isim = isim;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public int compareTo(Ogrenci o) {
        return new String(this.isim).compareTo(o.getIsim());
    }

    @Override
    public int hashCode() {
        return this.okulNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.okulNo == ((Ogrenci)obj).getOkulNo() ) {

            return true;

        }else {
            return false;
        }
    }
}
