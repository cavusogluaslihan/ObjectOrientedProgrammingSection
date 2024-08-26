package com.example.objectorientedprogramming;

public class OgrencilerConstructorMain {
    public static void main(String args[]){

        Ogrenciler ogrenci = new Ogrenciler();
        ogrenci.adres ="Ankara";
        ogrenci.isim = "Asli Han";
        ogrenci.okulNo = 1215312;


        System.out.println(ogrenci.isim);

        // yukarıda parametreleri tek tek doldurmuştuk
        // Class içerisinde constructor eklenirse, burada yeni item oluştururlurken dpğrudan içinde tanımlanabiliyor.
        Ogrenciler ogrenci2 = new Ogrenciler("Ahmet", 1215412, "Mersin");

        System.out.println(ogrenci2.isim);
        System.out.println(ogrenci2.adres);
    }

}
