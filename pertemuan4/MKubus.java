//        File : MKubus.java  08/03/2023
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : driver class untuk Kubus dan BujurSangkar

public class MKubus{
    public static void  main(String[] args){
        BujurSangkar s = new BujurSangkar(10);
        Kubus k = new Kubus(s);
        System.out.printf("\nKubus telah terbentuk dengan panjang sisi : " + s.getPanjangSisi());
        System.out.printf("\nKubus telah terbentuk dengan Volume :  "+ k.hitungVolume());
        System.out.printf("\nKubus telah terbentuk dengan Luas Alas :  "+ k.hitungLuasAlas());
        System.out.printf("\nKubus telah terbentuk dengan masing2 permukaan berluaskan :  "+ s.hitungLuas());
    }
}
