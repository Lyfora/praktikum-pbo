//        File : BangunDatarGenericTest.java  
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : main driver untuk ujicoba BangunDatar yg bertipe Generic dan implementasinya

public class BangunDatarGenericTest {
    public static void main(String args[]){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling Lingkaran " + bdg.hitungKeliling());
        System.out.println(bdg.get().getClass().getName());
    }
}

//Jawab Pertanyaan
// Ketika T diganti dengan T1/T2/T3/T4, maka Program tetap bisa berjalan. T1 dan sebagainya
// dapat dianggap sebagai sebuah variabel penampung saja untuk tipe real dari Genericnya, dan program dapat berjalan dengan syarat Semua T diubah ke T1/T2/dsb
