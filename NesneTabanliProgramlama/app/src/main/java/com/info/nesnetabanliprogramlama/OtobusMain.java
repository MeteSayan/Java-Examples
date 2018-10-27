package com.info.nesnetabanliprogramlama;

public class OtobusMain {

    public static void main(String[] args) {

        Otobus kamilKoc = new Otobus();

        kamilKoc.kapasite = 50;
        kamilKoc.mevcutYolcu = 20;
        kamilKoc.nereden = "İSTANBUL";
        kamilKoc.nereye = "BURSA";

        Otobus nilüfer = new Otobus();

        nilüfer.kapasite = 40;
        nilüfer.mevcutYolcu = 10;
        nilüfer.nereden =  "ANKARA";
        nilüfer.nereye = "İZMİR";

       /* kamilKoc.bilgiAl();
        nilüfer.bilgiAl();*/

       kamilKoc.yolcuAl(20);
       kamilKoc.yolcuIndir(30);

       kamilKoc.bilgiAl();

       kamilKoc.nereye = "İZMİR";

       kamilKoc.bilgiAl();

    }

}
