//        File : Asersi2.java  
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : class untuk asersi lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2{
    public static void main(String[] args){
        double jariJari=0;
        assert(jariJari>0):"Jari jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran = "+kelilingLingkaran);
    }
}

//Menjawab pertanyaan, mengapa assertions diatas salah
// Seharusnya apabila asersi tersebut salah, sebaiknya program dihentikan dan 
// tidak diteruskan dalam pembentukan Lingkaran L maupun penghitungan fungsi setelahnya