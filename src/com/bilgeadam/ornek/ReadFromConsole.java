package com.bilgeadam.ornek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsole {

    public static void main(String[] args) {


        //Scanner objesiyle console'dan veri okuyabiliyoruz.
        Scanner sc = new Scanner(System.in);

        System.out.print("İsminizi giriniz:");

        String isim = sc.nextLine();

        System.out.print("Yaşınızı giriniz:");

        int yas = 0;
        try {
            yas = sc.nextInt();
        }
        catch (InputMismatchException e) {
            System.err.println("Hata: Yaş alanına sayı girmek zorundasın!");
            System.exit(-1);
        }
        //int yas = (int)sc.nextDouble();

        if (yas <= 35)
            System.out.println(yas + " yaşında yolun 1. yarısındasın " + isim + ".");
        else
            System.out.println(yas + " yaşında yolun 2. yarısındasın " + isim + ".");


    }

}
