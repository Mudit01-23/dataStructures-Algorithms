
import java.util.Scanner;

public class A8_FindMagicNumber {
    public static void main(String[] args) {
        // find nth magic number in the following form

        /*
         *          5^3     5^2     5^1
         *     1=    0       0       1  = 5
         *     2=    0       1       0  = 25
         *     3=    0       1       1  = 30
         *     4=    1       0       0  = 125
         *     5=    1       0       1  = 130
         *     and so on  
         */

         // find the binary number multiply it with power 5
         System.out.print("Enter the value of n: ");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int answer= 0;
         int base = 5;
         
         while(n>0){
             int last = n&1;
            n = n>>1;
            answer =answer+ last*base;
            base = base*5;
         }
         System.out.print("Magic number: "+ answer);

    }
}