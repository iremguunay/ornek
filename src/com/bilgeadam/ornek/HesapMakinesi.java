package com.bilgeadam.ornek;

public class HesapMakinesi {

    //method overloading
    //aynı isimli method tanımlıyoruz, parametre sayısı veya veri tipleri farklı

    public int topla(int sayi1, int sayi2) {

        System.out.println("int topla çalıştı");
        return sayi1 + sayi2;
    }

    public double topla(double sayi1, double sayi2) {

        System.out.println("double topla çalıştı");
        return sayi1 + sayi2;
    }

    public int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public double bol(int sayi1, int sayi2) {
        return sayi1 / (double) sayi2;
    }

    public int cikar(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    public static void main(String[] args) {
        HesapMakinesi hm = new HesapMakinesi();
        System.out.println(hm.topla(5, 7));
        System.out.println(hm.carp(5, 7));
        System.out.println(hm.bol(7, 2));
        System.out.println(hm.cikar(15, 7));

        int sonuc = hm.topla(5, 7);
        System.out.println("Sonuç: " + sonuc);

        System.out.println("-------------------");

        System.out.println(hm.topla(7.1, 6.4));
    }
}
