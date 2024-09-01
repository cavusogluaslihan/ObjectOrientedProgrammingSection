package com.example.objectorientedprogramming;

import java.util.Scanner;

public class Odev5IcAciToplami_AC {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value : ");
        int kenarSayisi = scanner.nextInt();

        Odevler_AC o = new Odevler_AC();
        o.icAciToplami(kenarSayisi);


    }
}
