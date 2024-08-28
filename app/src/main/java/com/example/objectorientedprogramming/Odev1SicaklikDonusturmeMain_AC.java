package com.example.objectorientedprogramming;

import java.util.Scanner;

public class Odev1SicaklikDonusturmeMain_AC {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sıcaklık Değeri Dönüştürme (°C -> °F) ");
        System.out.println("Dönüştürmek istediğiniz dereceyi (°C) giriniz : ");
        double sicaklikDerece = scanner.nextDouble();


        Odevler_AC sicaklikDonusturme= new Odevler_AC();
        sicaklikDonusturme.sicaklikDonustur(sicaklikDerece);

    }
}
