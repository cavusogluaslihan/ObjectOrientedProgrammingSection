package com.example.objectorientedprogramming;

public class Matematik {
    // void: geri dönüş değeri yok
    public void carpma(int sayi1, int sayi2, int sayi3){

        int sonuc = sayi1 * sayi2 * sayi3 ;
        System.out.println(sonuc);
    }

    public int topla(int sayi1, int sayi2, int sayi3){

        int sonuc = sayi1 + sayi2 + sayi3;
        return sonuc;
    }

    public int cikarma (int sayi1, int sayi2, String isim){
        int cikarmaSonuc = sayi1 - sayi2;
        System.out.println("İşlemi Yapan : " + isim);
        return cikarmaSonuc;
    }

}
