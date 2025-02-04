
import java.util.Scanner;



public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that you want to convert in binary: ");
        int n = sc.nextInt();
        System.out.print("The binary representation is: ");
       findBinary(n);
        
    }
    static void findBinary(int n){
        if(n>0){
            findBinary(n/2);
            System.out.print(n%2);
        }
    }
}
