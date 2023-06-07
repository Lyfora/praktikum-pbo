//        File : BangunDatarGeneric.java  
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : generic class untuk BangunDatar
public class BangunDatarGeneric<T extends BangunDatar>{
    private T bangunDatar;
    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    public T get(){
        return bangunDatar;
    }
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
