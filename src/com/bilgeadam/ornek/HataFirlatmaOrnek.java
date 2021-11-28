package com.bilgeadam.ornek;

public class HataFirlatmaOrnek {

    public double bol(int sayi1, int sayi2) throws ArithmeticException {

        return sayi1/sayi2;
    }

    public double divide(int sayi1, int sayi2) throws ArithmeticException {

        return bol(sayi1, sayi2);
    }

    public static void main(String[] args) {

        try {
            HataFirlatmaOrnek hfo = new HataFirlatmaOrnek();

            System.out.println(hfo.divide(6,0));
        } catch (ArithmeticException e) {
            System.err.println("0'a bölme hatası!");
        }

    }
}
