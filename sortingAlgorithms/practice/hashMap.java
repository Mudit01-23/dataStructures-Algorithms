package practice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class hashMap {
    public static void main(String[] args) {
        // stores keys <-> value
        HashMap<String,Integer> map = new HashMap<>();
        map.put("CNG",40);
        map.put("Diesel",80);
        map.put("Petrol",110);
        map.put("Electricity",10);
// HashMaps are unordered maps
       
    for(Map.Entry<String,Integer> e : map.entrySet()){
        System.out.println(e.getKey()+ "-" + e.getValue());
    }

    }
}
