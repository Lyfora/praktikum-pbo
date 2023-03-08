
//        File : MPoligon.java  08/03/2023
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : driver class untuk poligon dan persegi panjang


package org.main;
import org.bangundatar.*;
public  class MPoligon{
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
	  Segitiga abc = new Segitiga(4,5,3);
        persegi.printInfo();
	  abc.printInfo();
        System.out.println("Luas Persegi Panjang :"+ persegi.hitungLuas());
	  System.out.println("Luas Segitiga :" + abc.hitungLuas());
    }
}