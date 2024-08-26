package com.example.objectorientedprogramming;

public class Ogrenciler {
    String isim;
    int okulNo;
    String adres;

    public Ogrenciler(){

    }

    // this. ekleyerek buradaki tanımların class içinde çağırılan global tanımlar olduğunu, sağ taraftakilerin de parametre içinde çağırılan local tanımlar olduğunu ayırırız
   // bu işleme shadowing denir

    public Ogrenciler(String isim, int okulNo, String adres ){
        this.isim = isim;
        this.okulNo = okulNo;
        this.adres = adres;
    }

}
