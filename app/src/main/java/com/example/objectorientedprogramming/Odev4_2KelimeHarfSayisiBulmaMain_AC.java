package com.example.objectorientedprogramming;

import java.util.Scanner;

public class Odev4_2KelimeHarfSayisiBulmaMain_AC {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String kelime = scanner.next();
        System.out.print("Harf giriniz : ");
        char harf = scanner.next().charAt(0);

        Odevler_AC harfSiraBulma = new Odevler_AC();
        harfSiraBulma.harfSayisiBul(kelime, harf);


}
}
