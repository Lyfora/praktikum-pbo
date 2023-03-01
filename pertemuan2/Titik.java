/* Nama file    : Titik.java
Pembuat         : Axelliano Rafael Situmeang
NIM             : 24060121130089
Tanggal         : 1 Maret 2023
Deskripsi       : File Titik pasca pengubahan dengan penambahan enscapulation private dan public
Lab             : B
 */
public class Titik {
    private double absis;
    private double ordinat;
    private static int CounterTitik;

    public Titik(){
        CounterTitik = CounterTitik+1;
    }
    public Titik(double a, double o){
        absis = a;
        ordinat = o;
        CounterTitik = CounterTitik+1;
    }
    public static int getCounterTitik(){
        return CounterTitik;
    }

    public void setAbsis(double a){
        absis = a;
    }
    public void setOrdinat(double o){
        ordinat=o;
    }

    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }
}
