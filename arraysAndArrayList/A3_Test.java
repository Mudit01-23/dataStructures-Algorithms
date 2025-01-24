import java.util.Arrays;
import java.util.Scanner;

public class A5_Test {
    static int a = 10;
    static int b = 20;
    public static void main(String[] args) {
      System.out.println("Enter the number of elements in the array");
           Scanner sc = new Scanner(System.in);
           int sizeOfArray = sc.nextInt();
           int[] array = new int[sizeOfArray];
           for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
           }
           System.out.println(Arrays.toString(array));
    }


   
    
}
