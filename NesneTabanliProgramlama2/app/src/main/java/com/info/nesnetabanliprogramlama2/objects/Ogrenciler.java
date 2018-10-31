package com.info.nesnetabanliprogramlama2.objects;

public class Ogrenciler {

    private String isim;
    private int okulNo;

    public void setIsim(String isim){
        this.isim = isim;
    }

    public String getIsim(){
        return this.isim;
    }

    public void setOkulNo(int okulNo){
        this.okulNo = okulNo;
    }

    public int getOkulNo(){
        return this.okulNo;
    }

    public void bilgiAl(){
        System.out.println("Öğrenci adı: " + isim);
        System.out.println("Öğrencinin okul no: "+okulNo);
    }

}
