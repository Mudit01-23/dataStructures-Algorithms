
import java.util.Scanner;

public class A1_EvenOrOdd {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
           
        evenOrOdd();
        sc.close();
    }
    static void evenOrOdd(){
        char state = 'y';
        while(state == 'y'){
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            if((n&1)==1){
                System.out.println("odd");
            }
            else{
                System.out.println("even");
            }


            System.out.print("press y if you want to check again, n to quit: ");
            state = sc.next().charAt(0);
        }

       
       

    }
}
