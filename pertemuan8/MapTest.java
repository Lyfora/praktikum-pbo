//        File : MapTest.java  
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : driver class untuk Map


import java.util.*;

public class MapTest{
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"satu");
        map.put(2, "ketiga");
        System.out.println(map.get(1));

        for(Integer keys : map.keySet()){
            System.out.println(keys + ":"+ map.get(keys));
        }
    }
}

