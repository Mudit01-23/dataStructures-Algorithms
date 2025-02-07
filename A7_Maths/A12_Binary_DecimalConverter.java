
import java.util.Scanner;

public class A12_Binary_DecimalConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 if you want to convert decimal to binary and 2 if you want to convert binary into decimal number");

        int n = sc.nextInt();
        if(n == 1){
            System.out.print("Enter the value of number: ");
            int num = sc.nextInt();
            System.out.print("The value of " + num +"in binary is : ");
            binaryConverter(num);
            System.out.println();
        }
        else{
            System.out.print("Enter the value of number: ");
            int num = sc.nextInt();
            int answer = decimalConverter(num);
            System.out.println("The value of "+ num + " in decimal is: "+ answer);
        }
    }

    static void binaryConverter(int n){
        if(n>0){
            binaryConverter(n/2);
            System.out.print(n%2);
        }
    }

    static int decimalConverter(int n){
        int base = 1; // Start with 2^0
        int answer = 0;

        while (n > 0) {
            int currentNumber = n%10; // Extract the last digit (0 or 1)
            n = n/10;
            answer = answer + currentNumber * base;
            base = base * 2; // Increase base by a power of 2
            
        }

        return answer;
        }
    }
