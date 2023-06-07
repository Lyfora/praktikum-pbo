//        File : LambdaHashMap.java  
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : driver class untuk Map


import java.util.*;

public class LambdaHashMap{
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("24060121130089","Axelliano Rafael Situmeang");
        map.put("24060121130087", "Prabowo Subianto");

        map.forEach((key,value)-> {System.out.println("NIM/Key: "+key + " - Nama/Value : " + value);});
    }
}

