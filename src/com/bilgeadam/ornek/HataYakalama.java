package com.bilgeadam.ornek;

import com.sun.org.apache.xalan.internal.xsltc.runtime.ErrorMessages_zh_CN;

public class HataYakalama {

    public static void main(String[] args) {

        try {
            int sayi1 = 7;
            int sayi2 = 0;

            double sonuc = sayi1 / sayi2;

            System.out.println("Sonuç: " + sonuc);

        }

        catch (ArithmeticException ae) {

            System.err.println("Hata: Sıfıra bölme hatası!");
        }

        catch (Exception e) {

            System.err.println("Hata oluştu!" + e.getMessage());

        }

    }
}
