
import java.util.Scanner;


public class test1 {

    // odd or even
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num  = sc.nextInt();
        evenOrOdd(num);
      
    }

    static void evenOrOdd(int num){
        if((num&1)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("Even");
        }
    }
    
}
