import java.util.Scanner;
public class A4_fibonacciNumberWithoutRecursion {
    public static void main(String[] args) {
        // find n'th fibonacci number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printFib(num);
    }
    static void printFib(int num){

        if(num==1){
            System.out.println("0");
            return;
        }
        if(num==2){
            System.out.println("0,1");
            return;
        }

        if(num>2){
            System.out.print("0,1,");
        }
        
        int a = 0, b = 1;
        for (int i = 2; i <= num; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            
            System.out.print(temp+ ",");
        }
    }
   
    
}
