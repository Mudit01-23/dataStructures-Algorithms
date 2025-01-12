package practice;
import java.util.HashSet;
import java.util.Iterator;
public class hashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");
        
        Iterator i = set.iterator();

        while(i.hasNext()){
            
            System.out.print(i.next());
        }
         
    }
}
