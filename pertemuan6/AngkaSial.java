//        File : AngkaSial.java  
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : driver class untuk ujicoba Custom Exception

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+"bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hatii Apollo 13 Meledak");
        }
    }
}
//Jawab pertanyaan, Ketika eksepsi terjadi apakah System.out.printf(Bukan angka sial dieksekusi?)
// Jawab : Tidak, terlihat ketika di run step tersebut akan langsung di skip dan setelahnya untuk as.cobaAngka(12) tidak dijalankan

//Apakah baris CatchAngkaSial dieksekusi
// ya, karena menerima throw dari as.cobaAngka(13)