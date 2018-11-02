package com.info.nesnetabanliprogramlama3.Main;

import com.info.nesnetabanliprogramlama3.Objects.Isci;
import com.info.nesnetabanliprogramlama3.Objects.Mudur;
import com.info.nesnetabanliprogramlama3.Objects.Ogretmen;
import com.info.nesnetabanliprogramlama3.Objects.Personel;

public class OkulOrnekMain {

    public static void main(String[] args) {


        Mudur mudur = new Mudur();
        Personel ogretmen = new Ogretmen();
        Personel isci = new Isci();

        mudur.iseAl(ogretmen);
        mudur.iseAl(isci);

        mudur.terfiEttir(ogretmen);

        mudur.terfiEttir(isci);


    }

}
