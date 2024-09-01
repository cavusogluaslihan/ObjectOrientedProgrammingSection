package com.example.objectorientedprogramming;

import java.util.Scanner;

public class Odev2DikdortgenCevreHesaplamaMain_AC {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double uzunKenar;
        double kisaKenar;

        System.out.println("Dikdörtgen Çevre Hesaplama İşlemi");
        System.out.println("Lütfen uzun kenarı giriniz : ");
        uzunKenar = scanner.nextDouble();

        while (true){
            System.out.println("Lütfen kısa kenarı giriniz : ");
            kisaKenar = scanner.nextDouble();

            if (kisaKenar<uzunKenar){
                break;
            } else {
                System.out.println("Dikdörtgende kısa kenar uzun kenara eşit ya da büyük olamaz. Lütfen geçerli bir değer giriniz.");

            }
        }

        Odevler_AC cevreHesabi = new Odevler_AC();
        cevreHesabi.cevreHesabi(kisaKenar,uzunKenar);

    }
}
