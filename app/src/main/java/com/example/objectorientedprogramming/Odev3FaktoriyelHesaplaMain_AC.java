package com.example.objectorientedprogramming;

import java.util.Scanner;

public class Odev3FaktoriyelHesaplaMain_AC {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Faktöriyel Hesabı");
        System.out.println("Hesaplamak istediğiniz sayıyı giriniz");
        int girilenSayi = scanner.nextInt();

             Odevler_AC faktoriyelHesabi = new Odevler_AC();
             faktoriyelHesabi.faktoriyelHesapla(girilenSayi);
         }





    }


