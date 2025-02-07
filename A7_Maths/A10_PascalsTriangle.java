
import java.util.Scanner;

public class A10_PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        //int answer =(int) Math.pow(2,n-1);
        int answer = 1<<(n-1);
        System.out.println(answer);
 
    }
}
