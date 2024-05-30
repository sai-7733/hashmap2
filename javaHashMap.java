import java.util.*;
class A{
    public static void main(String args[]){
        HashMap<String,Integer> a1=new HashMap<>();
        a1.put("sai",5);
        a1.put("Rohit",2);
        a1.put("kohli",7);
        a1.put("surya",9);
        System.out.println(a1);
        LinkedHashMap<String,Integer> list = new LinkedHashMap<>();
        a1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(entry -> list.put(entry.getKey(),entry.getValue()));
        System.out.println(list);
    }
}