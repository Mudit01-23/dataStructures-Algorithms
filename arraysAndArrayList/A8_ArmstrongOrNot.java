import java.util.Scanner;
public class A8_ArmstrongOrNot{         // armstrong numbers are the numbers in which the sum of digits raised to the power number of digit is equal to the number. Eg- 0^1 = 0 till 9^1=9; all 1 digit numbers are armstrong numbers, no 2 digits numbers are armstrong numbers, and in 3 digits, 4 numbers are armstrong numbers - 153, 370, 371, and 407

    
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean answer = ArmstrongOrNot(num);
        System.out.println(answer);
    }
    static boolean ArmstrongOrNot(int originalNumber){
        int num = originalNumber;
        int sum = 0;
        while(num>0){
            int currentDigit = num%10;
            sum  = sum+(currentDigit*currentDigit*currentDigit);
            num = num/10;   
        }
        if(originalNumber== sum){
            return true;
        }
        return false;
    }
}