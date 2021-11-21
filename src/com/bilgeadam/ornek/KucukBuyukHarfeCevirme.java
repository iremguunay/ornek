package com.bilgeadam.ornek;

import sun.nio.cs.ext.MacTurkish;

import java.util.Locale;

public class KucukBuyukHarfeCevirme {

    public static void main(String[] args) {

        //Büyük harfe çevir

        String isim1 = "Mustafa";
        System.out.println(isim1.toUpperCase());

        //Küçük harfe çevir

        String isim2 = "BORA";
        System.out.println(isim2.toLowerCase());

        String isim3 = "izmirli İĞDELER";
        System.out.println(isim3.toUpperCase());

        String isim4 = "IĞDIRLI ıspanaklar";
        System.out.println(isim4.toLowerCase());
        System.out.println(isim4.replace("I", "ı").toLowerCase());

        String isim5 = "izmirli İĞDELER";
        System.out.println(isim5.toUpperCase());
        System.out.println(isim5.replace("i", "İ").toUpperCase());


        Locale localeTR = new Locale("tr","TR");

        String kelime1 = "izinli İSTANBUL";

        System.out.println(kelime1.toUpperCase(localeTR));

    }
}
