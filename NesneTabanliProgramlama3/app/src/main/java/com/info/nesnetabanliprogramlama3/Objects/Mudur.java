package com.info.nesnetabanliprogramlama3.Objects;

public class Mudur extends Personel {

    public void iseAl(Personel p){
        p.iseAlindi();
    }

    public void terfiEttir(Personel p){



        if (p instanceof Ogretmen){
            ((Ogretmen)p).maasArttir();
        }
        if (p instanceof  Isci){
            System.out.println("İşçiler terfi alamaz.");
        }
    }

}
