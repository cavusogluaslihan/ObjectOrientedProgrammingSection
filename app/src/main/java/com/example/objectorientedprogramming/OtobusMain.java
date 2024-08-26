package com.example.objectorientedprogramming;

public class OtobusMain {
    public static void main(String args[]){
        Otobus kamilKoc = new Otobus();
        kamilKoc.marka = "KAMİL KOÇ" ;
        kamilKoc.kapasite = 45;
        kamilKoc.mevcutYolcu = 41;
        kamilKoc.kalkisNoktasi = "Ankara";
        kamilKoc.varisNoktasi = "Bursa";

        Otobus pamukkale = new Otobus();

        pamukkale.marka = "PAMUKKALE";
        pamukkale.kapasite = 50;
        pamukkale.mevcutYolcu = 33;
        pamukkale.kalkisNoktasi = "Ankara";
        pamukkale.varisNoktasi = "İzmir";

/*        System.out.println(pamukkale.marka);
        System.out.print("Kalkış : " +pamukkale.kalkisNoktasi + ", ");
        System.out.print("Varış : " + pamukkale.varisNoktasi + ", ");
        System.out.print("Mevcut Yolcu Sayısı : " + pamukkale.mevcutYolcu);


        System.out.println(kamilKoc.marka);
        System.out.print("Kalkış : " +kamilKoc.kalkisNoktasi + ", ");
        System.out.print("Varış : " + kamilKoc.varisNoktasi + ", ");
        System.out.print("Mevcut Yolcu Sayısı : " + kamilKoc.mevcutYolcu);*/

        kamilKoc.bilgiAl();
        pamukkale.bilgiAl();

        System.out.println("Pamukkale mevcut: " +pamukkale.mevcutYolcu);

        pamukkale.yolcuAl(20);

        System.out.println("Kamil Koç kapasite : " + kamilKoc.kapasite);
        System.out.println("Kamil Koç mevcut yolcu : " + kamilKoc.mevcutYolcu);
        kamilKoc.yolcuIndir(41);

        kamilKoc.varisNoktasi = "Adana";
        kamilKoc.bilgiAl();




    }
}
