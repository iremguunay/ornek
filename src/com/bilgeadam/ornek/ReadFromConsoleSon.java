package com.bilgeadam.ornek;

import java.util.Scanner;

public class ReadFromConsoleSon {

    private String isim;
    private int yas;

    Scanner sc = new Scanner(System.in);

    public void isimSor() {

        System.out.print("İsminizi giriniz:");
        isim = sc.nextLine();

    }

    public void yasSor() {

        System.out.print("Yaşınızı giriniz:");
        yas = sc.nextInt();

    }

    public void sonucYazdir() {

        if (yas <=35 )
            System.out.println(yas + " yaşında yolun 1. yarısındasın " + isim + ".");
        else
            System.out.println(yas + " yaşında yolun 2. yarısındasın " + isim + ".");
    }

    public static void main(String[] args) {

        ReadFromConsoleSon readConsole = new ReadFromConsoleSon();

        readConsole.isimSor();
        readConsole.yasSor();
        readConsole.sonucYazdir();

    }
}
