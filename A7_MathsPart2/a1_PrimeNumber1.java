
import java.util.Scanner;

public class a1_PrimeNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = isPrimeSecondMethod(n);
        if(isPrime){
            System.out.println(n+ " is a prime number");
        }
        else{
            System.out.println(n+ " is not a prime number");
        }
    }
    static boolean isPrime(int n){
        for(int i =2;i*i<=n;i++){ // or i<= Math.sqrt(n);
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // or this can also we written as- 

    static boolean isPrimeSecondMethod(int n){
        int i =2;
        while(i*i<=n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
