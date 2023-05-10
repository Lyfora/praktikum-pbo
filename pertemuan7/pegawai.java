//        File : pegawai.java  09/05/2023
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : superclass pegawai

public class Pegawai{
    protected String nama;
    protected int gajiPokok = 5000000;
    public void setNama(String Nama){
        this.nama = Nama;
    }
    public String getNama(){
        return this.nama;
    }
    public int getGajiPokok(){
        return this.gajiPokok;
    }
    public void tampilData(){
        System.out.printf("Nama : %s , Gaji Pokok = %d", this.getNama(),this.getGajiPokok());
        System.out.println();
    }
}
