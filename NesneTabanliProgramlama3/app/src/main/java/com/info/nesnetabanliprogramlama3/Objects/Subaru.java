package com.info.nesnetabanliprogramlama3.Objects;

public class Subaru extends Araba{

    private String motorHacmi;

    public Subaru(){
        super("Sedan");
        System.out.println("Subaru boş constructor çalıştı.");

    }

    public Subaru(String motorHacmi){

        super();
        this.motorHacmi = motorHacmi;
        System.out.println("Subaru dolu constructor çalıştı.");
    }

    public String getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(String motorHacmi) {
        this.motorHacmi = motorHacmi;
    }
}
