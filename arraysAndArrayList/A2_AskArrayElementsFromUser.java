import java.util.Arrays;
import java.util.Scanner;

public class A2_AskArrayElementsFromUser {
    public static void main(String[] args) {


        // int[] array = new int[5];
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < array.length; i++) {
        //     System.out.print("Enter the "+ i +" element: ");
        //     array[i]= sc.nextInt();
        // }
        //System.out.println(Arrays.toString(array));
        // or we can print the elements in the array using same for loop.

        // for(int i = 0;i<array.length;i++){
        //     System.out.print(array[i]+ ",");
        // }


        // or we can use Enhanced for loop to print the array

        //   for(int i: array){
        //   System.out.print(array[i]+ ",");
        //   }

        //*************************//*************************//*************************//****** */

            // array of characters 

    // char[] array = new char[5];    
    // Scanner sc = new Scanner(System.in);

    // for(int i = 0;i<array.length;i++){

    //     System.err.print("Enter the "+ i+ " element-");
    //     array[i] = sc.next().charAt(0);
    // }

    // System.out.println(Arrays.toString(array));

    //*************************//*************************//*************************//****** */

    // array of strings
    
    Scanner sc = new Scanner(System.in);
    String[] array = new String[5];

    for(int i =0;i<array.length;i++){
        System.out.print("Enter the "+ i+ " element-");
        array[i]= sc.nextLine();
    }
    System.out.println(Arrays.toString(array));


    }
}
