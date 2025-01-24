
import java.util.Scanner;

public class A7_PrimeOrNot {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String answer = primeOrNot(num);
        boolean answer1 = primeOrNot1(num);
        System.out.println(answer);
        System.out.println(answer1);


    }
    static String primeOrNot(int num){
        if(num<2){
            return "not a prime number";
        }
        for (int i = 2; i *i<= num; i++) {  // either use Math.sqrt(num), or use -> (int i =2;i*i<=num;i++);
            if(num%i==0){
                return "Not a prime number";
            }
        }
        return "Prime number";
    }

    static boolean primeOrNot1(int num){
        if(num<=1){
            return false;
        }
        int n =2;
        while(n*n<=num){
            if(num%n==0){
                return false;
            }
            else{
                n++;
            }
        }


        return true;
    }


}
