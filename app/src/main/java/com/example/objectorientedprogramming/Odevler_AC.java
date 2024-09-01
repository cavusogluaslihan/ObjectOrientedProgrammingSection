package com.example.objectorientedprogramming;

import java.util.Locale;

public class Odevler_AC {

public void sicaklikDonustur(double sicaklikDerece){

    double f = ((sicaklikDerece*1.8)+32);

    System.out.println(sicaklikDerece + "°C -> " + f +"°F'e eşittir.");

    }

    public void cevreHesabi(double kisaKenar, double uzunKenar){
        double cevre = (kisaKenar+uzunKenar)*2;
 System.out.println("Dikdörtgenin çevresi "+ cevre +"'dir.");
    }


    public void faktoriyelHesapla(int sayi){
        int faktoriyel = 1;
        if (sayi==0){
            faktoriyel = 1;
            System.out.println("0" +"! "+(faktoriyel)+"'e eşittir.");
        }
        for (int f=1;f<(sayi+1);f++){
            faktoriyel = faktoriyel * f;

        }
        System.out.println(sayi +"! "+(faktoriyel)+"'e eşittir.");
    }

    public void harfSirasisiBul(String kelime, String harf){

        int index = kelime.indexOf(harf);

        if (index== -1){
            System.out.println("Aradığınız harf kelime içinde bulunmamaktadır.");
        }
        while (index != -1){
            System.out.println("Harf \"" + harf + "\" kelime içinde " + (index+1) +". sıradadır.");
            index = kelime.indexOf(harf, index+1);
        }

    }

    public void harfSayisiBul(String kelime, char karakter){

    kelime = kelime.toLowerCase();
    karakter = Character.toLowerCase(karakter);


    int boyut = kelime.length();
    char karakterler[]= new char[boyut];

    for (int i=0;i<boyut;i++){
        karakterler[i]= kelime.charAt(i);
        }
    int sayac = 0;
        for (int i=0;i<boyut;i++){
            if (karakterler[i]==karakter){
                sayac ++;
            }

        }
        System.out.println("Harf sayısı : "+sayac);

    }

    public void icAciToplami (int kenarSayisi){
    int icAci = (kenarSayisi-2)*180;
        System.out.println("Sum : " +icAci);
    }

    public void letter (String nameofStudent, int userId, int dayOff, String date , String nameOfParent ){
        System.out.println();
        System.out.println("       To Whom It May Concern,       ");
        System.out.println("İlgili öğrencinin (" + nameofStudent + " - öğrenci no : " +userId + ") " + dayOff + " gün izinli olmasını rica ediyorum." );
        System.out.println("Tarih : " + date);
        System.out.println("Ad-Soyad : " + nameOfParent );

    }


    public void salaryCalculate (int workingDay){

    int workingHours = workingDay * 8;
    int monthlySalary = 1750 ;
    int extraWorkingHours = workingHours - 160;

    if (workingHours <= 160){
            System.out.println("Your monthly salary is " +monthlySalary + " Turkish Liras.");
        }
    if (extraWorkingHours>0){
        int extraPayment = extraWorkingHours*10;
        int salaryWithExtra = monthlySalary + extraPayment;
        System.out.println("Your monthly salary is " + salaryWithExtra+ " Turkish Liras.");
        }
    }

    public void internetFee (int newQuota){
    int definedQuota = 50;
    int definedFee = 100;
    int extraUsage = newQuota - definedQuota;
    if (newQuota <= definedQuota){
        System.out.println("Your monthly internet fee is \" "+definedFee+ " \" Turkish Liras." );
        }
    if (extraUsage>0){
        int extraFee = extraUsage*4;
        int newTotalFee = definedFee + extraFee;
        System.out.println("Your monthly internet fee is \" "+newTotalFee+ " \" Turkish Liras." );
    }

    }




    }







