package com.bilgeadam.ornek;

public class VeriTipleri {

    public static void main(String[] args) {

        int yas = 60;

        char cinsiyet = 'K';

        String sehir = "Ankara";

        if (yas < 35) {
            System.out.println("Genç");
        }
        else {
            System.out.println("Yaşlı");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+"-Merhaba");
        }

        System.out.println("Şehir İndex: " + sehir.indexOf("A"));

        if (sehir.indexOf("A") >= 0) {
            System.out.println("İçinde A harfi var!");
        }

        String deneme = "Bora Yüret";
        System.out.println(deneme.substring(0,6));

    }
}
