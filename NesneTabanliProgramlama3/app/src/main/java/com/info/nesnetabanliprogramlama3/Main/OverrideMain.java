package com.info.nesnetabanliprogramlama3.Main;

import com.info.nesnetabanliprogramlama3.Objects.Hayvan;
import com.info.nesnetabanliprogramlama3.Objects.Kedi;
import com.info.nesnetabanliprogramlama3.Objects.Kopek;
import com.info.nesnetabanliprogramlama3.Objects.Memeliler;

public class OverrideMain {

    public static void main(String[] args) {
        //Override
        Hayvan h = new Hayvan();

        h.sesCikar();

        Memeliler m = new Memeliler();

        m.sesCikar();

        Kopek kopek = new Kopek();

        kopek.sesCikar();

        Kedi kedi = new Kedi();

        kedi.sesCikar();

        //Polymorphism
        Hayvan h1 = new Kedi();
        Hayvan h2 = new Kopek();
        Hayvan h3 = new Memeliler();


        h1.sesCikar();
        h2.sesCikar();
        h3.sesCikar();


    }

}
