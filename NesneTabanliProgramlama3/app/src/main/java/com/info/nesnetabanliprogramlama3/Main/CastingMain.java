package com.info.nesnetabanliprogramlama3.Main;

import com.info.nesnetabanliprogramlama3.Objects.Araba;
import com.info.nesnetabanliprogramlama3.Objects.Subaru;

public class CastingMain {

    public static void main(String[] args) {

        Subaru subaru = new Subaru();

        Araba araba = subaru;   //UP

        Araba araba1 = new Araba();

        Subaru subaru1 = (Subaru) araba1; //DOWN




    }

}
