/* Nama file    : MTitik.java
Pembuat         : Axelliano Rafael Situmeang
NIM             : 24060121130089
Tanggal         : 1 Maret 2023
Deskripsi       : File MTitik pasca pengubahan dengan penambahan enscapulation private dan public
Lab             : B
 */
public class OperasiTitik{
    private void refleksiSumbuX(Titik titik){
        double ordinat = titik.getOrdinat();
        titik.setOrdinat(ordinat*(-1));
    }
    private void refleksiSumbuY(Titik titik){
        double absis = titik.getAbsis();
        titik.setAbsis(absis*-1);
    }
    public Titik refleksiX(Titik titik){
        Titik test = new Titik(titik.getAbsis(),titik.getOrdinat());
        refleksiSumbuX(test);
        return test;
    }
    public Titik refleksiY(Titik titik){
        Titik test = new Titik(titik.getAbsis(),titik.getOrdinat());
        refleksiSumbuY(test);
        return test;
    }
}
