package com.example.objectorientedprogramming;

public class Otobus {
    // Özellikler
    String marka;
    int kapasite;
    int mevcutYolcu;
    String kalkisNoktasi;
    String varisNoktasi;

    public void bilgiAl(){
        System.out.println("Marka : " +marka);
        System.out.println("Kapasite : " +kapasite);
        System.out.println("Mevcut Yolcu Sayısı : " +mevcutYolcu);
        System.out.println("Kalkış Yeri : " +kalkisNoktasi);
        System.out.println("Varış Noktası : " +varisNoktasi);

    }

    public void yolcuAl(int ekYolcu){
     mevcutYolcu = mevcutYolcu + ekYolcu;

     if (mevcutYolcu>=kapasite){
         System.out.println("Otobüs Dolu ! Gösterilen kadar kişi ayakta : " + (mevcutYolcu-kapasite));
     } else {
         System.out.println("Kalan boş koltuk sayısı : " + (kapasite - mevcutYolcu));
     }
    }

    public void yolcuIndir(int indirilenYolcu){
        mevcutYolcu = mevcutYolcu - indirilenYolcu;

        if (mevcutYolcu==0){
            System.out.println("İndirilen Yolcu : "+ indirilenYolcu  +", Otobüs Boş!");
        } else {
            System.out.println("İndirilen Yolcu : "+ indirilenYolcu  +", Boş Koltuk : " + (kapasite-mevcutYolcu));
        }
    }

}
