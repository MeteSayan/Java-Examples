package com.info.nesnetabanliprogramlama2.main;

import com.info.nesnetabanliprogramlama2.objects.Adresler;
import com.info.nesnetabanliprogramlama2.objects.Filmler;
import com.info.nesnetabanliprogramlama2.objects.Kategoriler;
import com.info.nesnetabanliprogramlama2.objects.Kisiler;
import com.info.nesnetabanliprogramlama2.objects.Yonetmenler;

public class CompositionMain {

    public static void main(String[] args) {

       /* Adresler adres = new Adresler("İstanbul", "Fatih");

        Kisiler kisi1 = new Kisiler("Ahmet",2234122,adres);

        System.out.println("Kişi ad: "+kisi1.getIsim());
        System.out.println("Kişi tel: "+kisi1.getTel());
        System.out.println("Kişi il: "+kisi1.getAdres().getIl());
        System.out.println("Kişi ilçe: "+kisi1.getAdres().getIlce());*/


        Kategoriler kategori1 = new Kategoriler(1,"Drama");
        Kategoriler kategori2 = new Kategoriler(2,"Komedi");
        Kategoriler kategori3 = new Kategoriler(3,"Bilim Kurgu");

        Yonetmenler yonetmen = new Yonetmenler(2, "Yılmaz Erdoğan");

        Filmler film = new Filmler(10, "Vizontele", 2009, kategori2, yonetmen);

        System.out.println("Film id: "+film.getFilm_id());
        System.out.println("Film ad: "+film.getFilm_ad());
        System.out.println("Film yıl: "+film.getFilm_id());
        System.out.println("Film yönetmen: "+film.getYonetmen().getYonetmen_ad());
        System.out.println("Film kategori: "+film.getKategori().getKategori_ad());





    }

}
