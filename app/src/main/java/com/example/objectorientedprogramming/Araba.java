package com.example.objectorientedprogramming;

public class Araba {
    String renk;
    int hiz;
    double uzunluk;
    boolean calisiyorMu;


    // method: davranışı belirler

    public void calistir(){
        calisiyorMu = true;
    }
    public void durdur(){
        calisiyorMu = false;
    }
    public void hizlan(int hizArtisMiktari){
        hiz = hiz + hizArtisMiktari;
    }
    public void yavaslat(int hizDusmeMiktari){
        hiz = hiz - hizDusmeMiktari;
    }
}
