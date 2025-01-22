import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class A3_ArrayListConcept{
    public static void main(String[] args) {
        ArrayList<Integer> IntegerList = new ArrayList<Integer>();
        ArrayList<String> StringList = new ArrayList<String>();

        // adding integers in IntegerList
        IntegerList.add(1);
        IntegerList.add(4);
        IntegerList.add(0);

       // System.out.println(IntegerList.get(0));
        IntegerList.add(-1);
        // IntegerList.add(1,69);
        // int firstIndex = IntegerList.get(1);
        // System.out.println(firstIndex);
        // IntegerList.set(1,69420);
        // System.out.println(IntegerList);
        // IntegerList.remove(1);
        // System.out.println(IntegerList);
        // System.out.println(IntegerList.size());
        System.out.println(IntegerList);

        // for (int i = 0; i < IntegerList.size(); i++) {
        //     System.out.print(IntegerList.get(i)+ ",");
            
        // }
        Collections.sort(IntegerList);
        System.out.println(IntegerList);



        System.out.println("Default array sorting method");
        int[] array = {5,4,3,2,1};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}