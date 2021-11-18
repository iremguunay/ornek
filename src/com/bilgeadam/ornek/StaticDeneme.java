package com.bilgeadam.ornek;

public class StaticDeneme {

    // Instance variable
    int sayi1;

    // Class veriable - değişken static ise class variable'dır
    static int sayi2;

    public static void main(String[] args) {

        //static olmayan değişkene static method'dan erişilemez.
        //erişmek istiyorsak, class'ın kendi objesini oluşturup erişeceğiz.

        // Local variable, initialize etmek zorundayız
        // Yani ilk değeri vermek zorundayız
        int sayi3 = 0;

        StaticDeneme sd = new StaticDeneme();
        System.out.println("Sayı1 = " + sd.sayi1);

        System.out.println("Sayı2 = " + sayi2);
        System.out.println("Sayı3 = " + sayi3);

    }
}
