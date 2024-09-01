package com.example.objectorientedprogramming;

import java.util.Scanner;

public class Odev6Letter_AC {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the name of the student : ");
        String name = scanner.nextLine();

        System.out.print("Please enter student ID : ");
        int id = scanner.nextInt();

        System.out.print("Please enter how many days do you consider to take off? : ");
        int offDay = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter the date : ");

        String date = scanner.nextLine();


        System.out.print("Please enter the name of the parent : " );
        String parent = scanner.nextLine();

        Odevler_AC letter = new Odevler_AC();
        letter.letter(name,id,offDay,date,parent);
    }
}
