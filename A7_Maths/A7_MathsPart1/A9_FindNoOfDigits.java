
import java.util.Scanner;

public class A9_FindNoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int n = sc.nextInt();
        System.out.print("The binary representation of "+ n +"= " );
        findBinary(n);
        
        int counter = 0;
        while(n>0){
            counter = counter+1;
            n = n>>1;

        }
       
        // System.out.println(" and no of binary digits = "+ counter);

        // one more method for calculating the number of digits- 
        int base = 2;
        int answer= (int)(Math.log(10)/Math.log(base))+1;
        System.out.print(" and number of digits in "+n+" = "+ answer);
        

    }
    static void findBinary(int n){
        if(n>0){
            findBinary(n/2);
            System.out.print(n%2);
        }
    }
}
