public class BangunPersegi extends Poligon {
    private float panjangSisi;
    BangunPersegi(float s){
        this.panjangSisi = s;
        this.jumlahSisi = 4;
    }
    public float hitungLuas(){
        return this.panjangSisi*this.panjangSisi;
    }
    public getPanjangSisi(){
        return this.panjangSisi;
    }
}
