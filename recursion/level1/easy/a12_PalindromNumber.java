package easy;

public class a12_PalindromNumber {
    public static void main(String[] args) {
       // int n = 1234321;
        int n = 123;
        int num = 0;
        int reverseNumber = rev(n,num);
        if(n==reverseNumber){
            System.out.println("Is palindrome");
        }
        else{
            System.out.println("Is not palindrome");
        }
    }
    static int rev(int n, int reverse){
        if(n==0){
            return reverse;
        }
        int currentNumber = n%10;
        reverse = reverse*10+currentNumber;
        
        return rev(n/10, reverse);

    }
}
