//        File : ExceptionOnArray.java  
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : class untuk exception pada suatu Array

public class ExceptionOnArray{
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally{
            System.out.println("Clean up");
        }
    }
}