
import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = magicNumber(n);
        System.out.println(answer);
    }
    static int magicNumber(int n){
        int answer = 0;
        int base =5;
        while(n>0){
            int lastDigit = n&1;
            n = n>>1;
            answer = answer+ lastDigit*base;
            base = base*5;
        }
        return answer;
    }
}