package com.example.objectorientedprogramming;

import android.text.style.ScaleXSpan;

import java.util.Scanner;

public class OdevInternetFeeCalculatorMain_AC {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Odevler_AC internetFeeCalculate = new Odevler_AC();

    System.out.print("Please enter the total usage of Internet (GB) : ");
    int usageOfInternet = scanner.nextInt();

    internetFeeCalculate.internetFee(usageOfInternet);


    }
}
