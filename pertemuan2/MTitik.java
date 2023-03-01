/* Nama file    : MTitik.java
Pembuat         : Axelliano Rafael Situmeang
NIM             : 24060121130089
Tanggal         : 1 Maret 2023
Deskripsi       : File MTitik pasca pengubahan dengan penambahan enscapulation private dan public
Lab             : B
 */
public class MTitik {
    public static void main(String[] args){
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        Titik t3 = new Titik(5,6);
        Titik t4 = new Titik();
        Titik t5 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2.setAbsis(3);
        t2.setOrdinat(4);
        OperasiTitik op;
        op = new OperasiTitik();
        System.out.println("t3 sebelum fungsi Refleksi = ("+ t3.getAbsis()+","+t3.getOrdinat()+")");
        t4 = op.refleksiX(t3);
        System.out.println("t3 yang direfleksikan dengan sumbu X= ("+ t4.getAbsis()+","+t4.getOrdinat()+")");
        t5 = op.refleksiY(t3);
        System.out.println("t3 yang direfkleksikan dengan sumbu Y = ("+ t5.getAbsis()+","+t5.getOrdinat()+")");
        System.out.println("t3 setelah kedua fungsi refleksi= ("+ t3.getAbsis()+","+t3.getOrdinat()+")");
        
//        System.out.println("Jumlah Objek Titik : "+Titik.getCounterTitik());
//        System.out.printf("t1 = (%.1f,%.1f)\n",t1.getAbsis(),t1.getOrdinat());
//        System.out.printf("t2 = (%.1f,%.1f)\n",t2.getAbsis(),t2.getOrdinat());
//
//        System.out.println("t4 = ("+ t4.getAbsis()+","+t4.getOrdinat()+")");
    }
}
