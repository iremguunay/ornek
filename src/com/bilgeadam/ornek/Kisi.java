package com.bilgeadam.ornek;

import java.util.Date;

public class Kisi {

    private int no;
    private String ad;
    private String soyad;
    private double maas;

    // constructor overloading
    // which constructor is suitable when creating an object, it will run

    public Kisi() {
    }

    public Kisi(int no, String ad, String soyad, double maas) {
        this.no = no;
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
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

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public double yillikMaasGetir() {
        return this.maas * 12;
    }

    // public double yillikMaasGetir() {
    // double yillikMaas = this.maas * 12;
    // return yillikMaas;
    // }

    public String adSoyadGetir() {
        return this.ad + " " + this.soyad;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "no= " + no + "\n" +
                ", ad= " + ad + "\n" +
                ", soyad= " + soyad + "\n" +
                ", maas= " + maas + "\n" +
                ", yıllık maaş= " + yillikMaasGetir() + "\n" +
                ", ad soyad= " + adSoyadGetir() +
                '}';
    }
}
