import java.util.Scanner;

public class ComplementOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Calculate the complement
        int complement = ~num;

        // Print the result
        
        System.out.println("Complement in decimal: " + complement);
    }
}
