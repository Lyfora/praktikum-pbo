//        File : Asersi1.java  08/03/2023
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : class untuk asersi bilangan 0

public class Asersi1{
    public static void main(String[] args){
        int x=0;
        if(x>0){
            System.out.println("X bilangan positif");
        }else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("X bilangan negatif");
        }
    }
}
