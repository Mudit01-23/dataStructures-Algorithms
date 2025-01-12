package practice;
import java.util.Iterator;
import java.util.HashSet;
public class test1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
    
}
