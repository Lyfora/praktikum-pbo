//        File : Kubus.java  08/03/2023
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : class untuk Kubus
public class Kubus {
    private BujurSangkar permukaan;
    Kubus(BujurSangkar s){
        permukaan = s;
    }
    public float hitungVolume(){
        return permukaan.hitungLuas() * permukaan.getPanjangSisi();
    }
    public float hitungLuasAlas(){
        return 6*permukaan.hitungLuas();
    }
    
}