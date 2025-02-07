
import java.util.Scanner;

public class test2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("The binary representation of "+n+ " is: " );
        binaryRepresentation(n);
        
        int numberOfDigits = numberOfDigits(n);
        System.out.println(" and number of digits in "+ n+ " are: " + numberOfDigits);

    }
    static void binaryRepresentation(int n){
        if(n>0){
            binaryRepresentation(n/2);
            System.out.print(n%2);
        }
    }

    static int numberOfDigits(int n){
        int counter= 0;
        while(n>0){
            counter++;
            n= n>>1;
        }
        return counter;
    }
}