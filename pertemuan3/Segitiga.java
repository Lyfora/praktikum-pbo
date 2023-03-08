
//        File : Segitiga.java  08/03/2023
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : Representasi dasar dari Segitiga turunan poligon


package org.bangundatar;
import org.poligon.Poligon;
public  class Segitiga extends Poligon{
    private double alas,tinggi;
    public Segitiga(double alas,double tinggi,int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }
    public double hitungLuas(){
        return alas*tinggi/2;
    }
    public void printInfo(){
        System.out.println("Bangun Segitiga berisi "+ this.getJumlahSisi());
    }
}