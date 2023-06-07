//        File : MPoligon.java  08/03/2023
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi :  class untuk BujurSangkar yang anakan Poligon
public class BujurSangkar extends Poligon {
    private float panjangSisi;

    BujurSangkar(float s){
        this.panjangSisi = s;
        this.jumlahSisi = 4;
    }
    public float hitungLuas(){
        return this.panjangSisi*this.panjangSisi;
    }
    public float getPanjangSisi(){
        return this.panjangSisi;
    }
}
