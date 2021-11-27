package com.bilgeadam.ornek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsole2 {
    public static void main(String[] args) {

        int yas = 0;

        // Scanner objesiyle konsoldan veri okuyabiliyoruz.
        Scanner sc = new Scanner(System.in);

        System.out.print("İsminizi giriniz:");

        String isim = sc.nextLine();

        System.out.print("Yaşınızı giriniz:");

        try {

            yas = sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.err.println("Hata: Yaş alanına sayı girmek zorundasın!");
            System.exit(-1);
            //yas = 40;
        }

        //int yas = (int)(Double.parseDouble(sc.nextLine()));


        if (yas <= 35) {
            System.out.println(yas + " yaşında yolun 1. yarısındasın " + isim);
        } else {
            System.out.println(yas + " yaşında yolun 2. yarısındasın " + isim);
        }


    }
}