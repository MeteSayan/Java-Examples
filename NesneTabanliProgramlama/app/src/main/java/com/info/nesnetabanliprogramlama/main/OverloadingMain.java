package com.info.nesnetabanliprogramlama.main;

import com.info.nesnetabanliprogramlama.other.MatematikselHesaplama;

public class OverloadingMain {

    public static void main(String args[]){

        MatematikselHesaplama mh = new MatematikselHesaplama();

        mh.topla(4.59,30 );

        mh.topla(40, 30, "Mete");

    }

}
