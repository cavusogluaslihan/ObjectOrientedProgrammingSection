package com.example.objectorientedprogramming;

public class Islemler {

    public double ortalamaHesapla(double... sayilar){

        double toplam =0;

        for (double d:sayilar){
            toplam = toplam + d;
        }
        return toplam/ sayilar.length;
        }

    }

