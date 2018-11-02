package com.info.nesnetabanliprogramlama3.Main;

import com.info.nesnetabanliprogramlama3.Objects.AmasyaElmasi;
import com.info.nesnetabanliprogramlama3.Objects.Aslan;
import com.info.nesnetabanliprogramlama3.Objects.Eatable;
import com.info.nesnetabanliprogramlama3.Objects.Elma;
import com.info.nesnetabanliprogramlama3.Objects.Squeezable;
import com.info.nesnetabanliprogramlama3.Objects.Tavuk;

public class InterfaceMain {
    public static void main(String[] args) {

        Object aslan = new Aslan();

        Elma elma = new Elma();

        AmasyaElmasi amasyaElmasi = new AmasyaElmasi();

        Eatable tavuk = new Tavuk();

        Object[] nesneler = new Object[]{aslan,elma,amasyaElmasi,tavuk};

        for (Object o:nesneler) {
            if (o instanceof  Eatable){
                ((Eatable)o).howToEat();
            }
            if (o instanceof Squeezable){
                ((Squeezable)o).howToSqueeze();
            }
        }


    }

}
