import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        pattern(n);
    }

    static void pattern(int n) {
        // Loop for the upper part of the diamond
        for (int row = 1; row <= n; row++) {
            // Print spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print numbers in reverse
            for (int i = row; i >= 2; i--) {
                System.out.print(i);
            }

            // Print numbers in forward
            for (int j = 1; j <= row; j++) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line
        }

        // Loop for the lower part of the diamond
        for (int row = n - 1; row >= 1; row--) {
            // Print spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            // Print numbers in reverse
            for (int i = row; i >= 2; i--) {
                System.out.print(i);
            }

            // Print numbers in forward
            for (int j = 1; j <= row; j++) {
                System.out.print(j);
            }

            System.out.println(); // Move to the next line
        }
    }
}
