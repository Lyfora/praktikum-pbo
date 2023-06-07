//        File : ArrayListTest.java  
//        Penulias : Axelliano Rafael Situmeang / 24060121130089
//        Deskripsi : driver class untuk array list


import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        strings.remove("praktikum");

        for(String s : strings){
            System.out.print(s+" ");
        }

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"satu");
        map.put(2, "ketiga");
        System.out.println(map.get(1));

        for(Integer keys : map.keySet()){
            System.out.println(keys + ":"+ map.get(keys));
        }
    }
}
