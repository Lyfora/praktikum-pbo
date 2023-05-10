//        File : PolimorfismeCoercion.java  09/05/2023
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : driver main untuk Pegawai,manajer,programmer, dan Payroll
public class PolimorfismeCoercion {
    public static void main(String[] args){
         Pegawai pegawai = new Programmer("Mira");
         Pegawai pegawai2 = new Manajer("Joko");
         Pegawai pegawai3 = new Manajer("Argo");

         Payroll payroll = new Payroll();
         payroll.cetakGaji(pegawai);
         payroll.cetakGaji(pegawai2);
         payroll.cetakGaji(pegawai3);
    }
}
