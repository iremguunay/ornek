package com.bilgeadam.ornek;

public class Oyuncu {

    //static tanımlanırsa, class variable'dır
    //bir obje değeri değiştirirse,
    //diğer objelerde değişen değeri görür.

    //static demezsek instance variable'dır.
    //her obje değişkenlerin ilk değeriyle başlar.
    //örnek, int ise 0 değeriyle başlar her obje için
    //bir objenin değişkende yaptığ değişikliği
    //diğer objeler görmez

    private static int sayac;

    private int no;
    private String ad;
    private String soyad;

    public Oyuncu() {
        sayac = sayac + 1;
        // sayac += 1; -kısa yazılışı
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        Oyuncu.sayac = sayac;
    }
}
