package com.example.objectorientedprogramming;

import java.util.Scanner;

public class Odev7SalaryCalculatorMain_AC {
    public static void main(String args[]){


        Scanner scanner = new Scanner(System.in);
        Odevler_AC salaryCalculator = new Odevler_AC();
        int totalWorkingDays;

        while (true){
            System.out.print("Please enter \"How many days have you worked this month?\" : " );
            totalWorkingDays = scanner.nextInt();
        if (totalWorkingDays>31){
            System.out.println("It is not possible to work more than 31 days!");
        } else {
            salaryCalculator.salaryCalculate(totalWorkingDays);
            break;
        }
    }
}
}
