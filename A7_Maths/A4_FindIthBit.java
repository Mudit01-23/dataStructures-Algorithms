
import java.util.Scanner;

public class A4_FindIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
       int number = sc.nextInt();
        System.out.print("Enter the bit: ");
        int n = sc.nextInt();
        int ithBit = (number & (1<< n-1)) >> n-1;
        System.out.println("Ith bit = " + ithBit);
    }
}
