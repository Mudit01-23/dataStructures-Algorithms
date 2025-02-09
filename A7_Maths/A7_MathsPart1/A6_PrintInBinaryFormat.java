
import java.util.Scanner;
// there are 3 methods for it, first one is this one, use Integer.toBinaryString() method, 2nd one is using the normal brute force method using StringBuilder and while loop - while(num>0): remainder = number%2;, binary.append(remainder); number= number/2;, and third one is using recursion. 



public class A6_PrintInBinaryFormat{
    static Scanner sc = new Scanner(System.in);

    // public static void main(String[] args) {

    //     // Method 1- 
       
    //     System.out.println("Enter the number: ");
    //     int num = sc.nextInt();
        
    //     String binaryNotation = Integer.toBinaryString(num);
    //     System.out.println(binaryNotation);

    // }



    // public static void main(String[] args) {

    //     // Method 2- 
       
    //     System.out.println("Enter the number: ");
    //     int num = sc.nextInt();
        
    //     StringBuilder sb = new StringBuilder();

    //     while(num>0){
    //         int remainder = num%2;
    //         sb.append(remainder);
    //         num = num/2;
    //     }
    //     sb.reverse();
    //     System.out.println(sb);

    // }
    
    public static void main(String[] args) {

        // Method 3- Using recursion
       
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        System.out.print("Binary notation is: ");
        findBinary(num);

    }

    static void findBinary(int n){
        if(n>0){
            findBinary(n/2);
             System.out.print(n%2);
        }
    }

}