package com.example.objectorientedprogramming;

public class Odevler_AC {

public void sicaklikDonustur(double sicaklikDerece){

    double f = ((sicaklikDerece*1.8)+32);

    System.out.println(sicaklikDerece + "°C -> " + f +"°F'e eşittir.");

    }

    public void cevreHesabi(double kisaKenar, double uzunKenar){
        double cevre = (kisaKenar+uzunKenar)*2;
 System.out.println("Dikdörtgenin çevresi "+ cevre +"'dir.");
    }


    public void faktoriyelHesapla(int sayi){
        int faktoriyel = 1;

        for (int f=1;f<(sayi+1);f++){
            faktoriyel = faktoriyel * f;

        }
        System.out.println(sayi +"! "+(faktoriyel)+"'e eşittir.");
    }

    public void harfSayisiBul(String kelime, String harf){

        int index = kelime.indexOf(harf);

        if (index== -1){
            System.out.println("Aradığınız harf kelime içinde bulunmamaktadır.");
        }
        while (index != -1){
            System.out.println("Harf \"" + harf + "\" kelime içinde " + (index+1) +". sıradadır.");
            index = kelime.indexOf(harf, index+1);
        }

    }






}
