package com.example.objectorientedprogramming;

import java.util.Scanner;

public class Odev2DikdortgenCevreHesaplamaMain_AC {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dikdörtgen Çevre Hesaplama İşlemi");
        System.out.println("Lütfen kısa kenarı giriniz : ");
        double kisaKenar = scanner.nextDouble();
        System.out.println("Lütfen uzun kenarı giriniz : ");
        double uzunKenar = scanner.nextDouble();

        if (kisaKenar>=uzunKenar){
            System.out.println("Dikdörtgen uzun kenarı kısa kenara eşit ya da küçük olamaz! Lütfen geçerli bir değer giriniz.");
            System.out.println("Lütfen uzun kenarı giriniz : ");
            double uzunKenar2 = scanner.nextDouble();
            double cevre = (kisaKenar+uzunKenar2)*2;
            System.out.println("Dikdörtgen Çevresi : " + cevre + "'dir.");
        } else {
            double cevre = (kisaKenar+uzunKenar)*2;
            System.out.println("Dikdörtgen Çevresi : " + cevre + "'dir.");

        }


    }
}
