package com.example.objectorientedprogramming;

import java.util.Scanner;

public class Odev1SicaklikDonusturme_AC {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sıcaklık Değeri Dönüştürme (°C -> °F) ");
        System.out.println("Dönüştürmek istediğiniz dereceyi (°C) giriniz : ");
        double sicaklikDerece = scanner.nextDouble();

        double sicaklikFahrenhiet = ((sicaklikDerece*1.8)+32);

        System.out.println(sicaklikDerece + "°C -> " + sicaklikFahrenhiet+"°F'e eşittir.");


    }
}
