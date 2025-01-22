import java.util.Arrays;

public class A2_Comparision {
    public static void main(String[] args) {
        // String a = "Michael";
        // String b = "Michael";
        // System.out.println(a==b);

        String c = new String("Mike");
        String d = new String("Mike");      // here, since we are using the new keyword, the object is created outside the string pool but inside the heap.
        //System.out.println(c==d);
        // only check the values and not the ref variables are pointing to the same object or not-
        // System.out.println(c.equals(d));

        // System.out.println(c.charAt(2));

        System.out.println(Arrays.toString(new int[]{2,3,4}));


    }
}
