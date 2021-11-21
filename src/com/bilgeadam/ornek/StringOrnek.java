package com.bilgeadam.ornek;

public class StringOrnek {

    public static void main(String[] args) {

        // isim soyisim ayırma
        // Aziz Sancar

        //indexOf - boşluğu bulmak için işimize yarar

        String kelime1 = "Trabzon";

        System.out.println(kelime1.indexOf('z'));

        String kelime2 = "Trabzon Lisesi";

        System.out.println(kelime2.indexOf(" "));

        //substring

        String kelime3 = "İrem Günay";

        System.out.println(kelime3.substring(2));

        System.out.println(kelime3.substring(0,4));

        // length

        String kelime4 = "Trabzon";

        System.out.println(kelime4.length());

        String kelime5 = "            Trabzon            ";

        System.out.println(kelime5.length());

        //trim, başındaki sonundaki boşlukları atar
        System.out.println(kelime5.trim().length());

    }
}
