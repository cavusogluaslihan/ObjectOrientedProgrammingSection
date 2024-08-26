package com.example.objectorientedprogramming;

public class ArabaMain {

    public static void main(String args[]){

        // normal değişken
        int yas =30;
        // nesne oluşturma
        Araba bmw = new Araba();
        bmw.renk = "Kırmızı";
        bmw.hiz = 200;
        bmw.uzunluk = 2.05;
        bmw.calisiyorMu = true;

        Araba tofas = new Araba();
        tofas.renk = "Beyaz";
        tofas.hiz = 100;
        tofas.uzunluk = 2.45;
        tofas.calisiyorMu = false;

        /*System.out.println("BMW");
        System.out.println(bmw.renk);
        System.out.println(bmw.hiz);
        System.out.println(bmw.uzunluk);
        System.out.println(bmw.calisiyorMu);

        System.out.println("TOFAŞ");
        System.out.println(tofas.renk);
        System.out.println(tofas.hiz);
        System.out.println(tofas.uzunluk);
        System.out.println(tofas.calisiyorMu);
*/
        Araba renault = new Araba();
        renault.renk = "Sarı";
        renault.hiz = 180;
        renault.uzunluk = 2.10;
        renault.calisiyorMu = true;

        System.out.println("-----------Default Durum------------");
        System.out.println("BMW çalışma : " +bmw.calisiyorMu);
        System.out.println("Tofaş çalışma : " +tofas.calisiyorMu);
        System.out.println("Renault çalışma : " +renault.calisiyorMu);


        tofas.calistir();
        renault.durdur();


        System.out.println("BMW çalışma : " +bmw.calisiyorMu);
        System.out.println("Tofaş çalışma : " +tofas.calisiyorMu);
        System.out.println("Renault çalışma : " +renault.calisiyorMu);

        System.out.println("Default Hız : " +tofas.hiz);
        tofas.hizlan(50);
        System.out.println("Artış Sonrası Hız : " +tofas.hiz);

        System.out.println("Default Hız : " +bmw.hiz);
        bmw.yavaslat(20);
        System.out.println("Yavaşlatma Sonrası Hız : " +bmw.hiz);

        }


    }

