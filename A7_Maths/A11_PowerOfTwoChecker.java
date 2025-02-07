
import java.util.Scanner;
// Description - this code checks if a number is in power of 2 or not 
//  public class A11_PowerOfTwoChecker {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         // a number which is in power of 2 will be only have one 1, rest all 0's eg - 10, 100,1000,10000
//         // except 1 which is 2^0
//         if(n==0){
//             System.out.println(n + " is not in power of 2");
           
//         }
//         else if(n<0){
//             System.out.println("negative numbers cannot be in power of 2");
            
//         }

//         else{
//             int answer = powerOfTwoChecker(n);
//         if(answer ==1 ){
//             System.out.println(n + " is in power of 2");
//         }
//         else{
//             System.out.println(n + " is not in power of 2");
//         }
//         }
//     }
//     static int powerOfTwoChecker(int n){
        
//         int oneCounter = 0;
//         while( n>0){
//             int currentNumber = n&1;
//             if(currentNumber==1){
//                 oneCounter++;
//             }
//             n = n>>1;

//         }
//         return oneCounter;
//     }
// }

// other method for solving this - 

public class A11_PowerOfTwoChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<1){
            System.out.println(n + " is not in power of 2");
        }
        else if((n&n-1)==0){
            System.out.println(n + " is in power of 2");
        }
        else{
            System.out.println(n + " is not in power of 2");
        }
    }
}
