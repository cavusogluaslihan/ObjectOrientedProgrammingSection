package com.example.objectorientedprogramming;

import java.util.Scanner;

public class Odev4KelimeHarfSayisiBulmaMain_AC {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String kelime = scanner.next();
        System.out.print("Sıra numarasını bulmak istediğiniz harfi giriniz : ");
        String harf = scanner.next();


        Odevler_AC faktoriyelHesapla = new Odevler_AC();

        faktoriyelHesapla.harfSayisiBul(kelime, harf);

    }
}
