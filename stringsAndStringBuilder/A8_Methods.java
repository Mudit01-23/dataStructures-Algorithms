
import java.util.Arrays;

public class A8_Methods {
    public static void main(String[] args) {
        // to create character array
        String name = "Michael Jordan";
        System.out.println(Arrays.toString(name.toCharArray()));

        String name1 = "Lebron James";
        System.out.println(Arrays.toString(name1.toCharArray()));

        String name2= "Kevin Durant";
        System.out.println(Arrays.toString(name2.toCharArray()));      
        
        String[] arr = new String[]{name,name1,name2};
        System.out.println(Arrays.toString(arr));

        // reversing the string
        //System.out.println(name.);
        // coverting the string to lowercase

        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));

        // splitting of array
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
