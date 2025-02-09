
import java.util.Scanner;


public class test1 {

    // odd or even
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    
    System.out.print("The binary representation of "+ n+ "is:" );
    binaryRepresentation(n);
    int counter = 0;
    while(n>0){
        counter+=1;
        n = 1&(n>>1);
    }
    System.out.println("and the number of digits in binary format are "+ counter );
    
    

    }
    static void binaryRepresentation(int n){
        if(n>0){
            binaryRepresentation(n/2);
            System.out.print(n%2);
        }
    }
    
}
