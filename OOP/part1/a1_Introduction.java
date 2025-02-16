
import java.util.Arrays;
import java.util.Scanner;



public class a1_Introduction {
public static void main(String[] args) {
    // store 5 names


    // int[] rollNo = new int[5];
    Scanner sc = new Scanner(System.in);
    // for(int i =0;i<5;i++){
    //     System.out.print("Enter "+ (i+1)+" element: ");
    //     rollNo[i]= sc.nextInt();

    // }
    // sc.close();
    // System.out.println(Arrays.toString(rollNo));


    // store 5 names-

    String[] names = new String[5];
    for(int i=0;i<5;i++){
        System.out.print("Enter "+ (i+1)+ " name: ");
        names[i] = sc.next();
    }
    System.out.println(Arrays.toString(names));
}
    
}
