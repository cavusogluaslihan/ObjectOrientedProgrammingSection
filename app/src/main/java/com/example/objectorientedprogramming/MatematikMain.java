package com.example.objectorientedprogramming;

public class MatematikMain {
    public static void main(String args[]){

        Matematik m1 = new Matematik();

        m1.carpma(2,3,5);

        int gelenDeger = m1.topla(3,6,9);
        System.out.println("Toplam : " + gelenDeger);

       int cikarmaSonuc = m1.cikarma(12,10,"Asli");
System.out.println("Çıkarma : " +cikarmaSonuc);
    }
}
