package com.bilgeadam.ornek;

public class AritmetikOrnek {

    public static void main(String[] args) {

        int sayi1 = 7;
        int sayi2 = 2;

        double sonuc = sayi1 / (double)sayi2;

        System.out.println(sonuc);

        System.out.println("-------------------");

        // Modulus --> %

        System.out.println(5%2);

        int sayi3 = 21;

        if ((sayi3%2) == 1)
            System.out.println("Tek sayı");
        else
            System.out.println("Çift sayı");

        System.out.println("---------------------");

        // ++ operator

        int sayi4 = 9;

        System.out.println("sayi4 = " + ++sayi4);

        System.out.println("sayi4 = " + sayi4++);

        System.out.println("sayi4 = " + sayi4);

    }

}
