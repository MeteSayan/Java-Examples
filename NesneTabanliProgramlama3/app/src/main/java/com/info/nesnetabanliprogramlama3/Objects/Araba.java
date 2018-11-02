package com.info.nesnetabanliprogramlama3.Objects;

public class Araba extends Arac {

    private String kasaTipi;

    public Araba() {
        super();
        System.out.println("Araba boş constructor çalıştı.");

    }

    public Araba(String kasaTipi) {

        super("Beyaz","Otomatik");
        this.kasaTipi = kasaTipi;
        System.out.println("Araba dolu constructor çalıştı.");

    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public void setKasaTipi(String kasaTipi) {
        this.kasaTipi = kasaTipi;
    }

    public void bilgiAlAraba(){
        System.out.println(kasaTipi);
        System.out.println(super.getRenk());
        System.out.println(getVitesTipi());
    }
}
