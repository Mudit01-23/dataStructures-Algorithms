package practice;
import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("e");
        list.add("b ");
        list.add("g");
        // System.out.println(list); 

        // list.remove("e");
        // System.out.println(list);

            
        
        Iterator i = list.iterator();
        while(i.hasNext()){
            System.out.print(i.next());
        }


     }
}
