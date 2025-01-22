import java.util.Scanner;
public class A9_PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //String str1 = "abcd"; 
        boolean answer = isPalindrome(str);

        if(answer == true){
            System.out.println(str + " is Palindrome");
        }
        else{
            System.out.println(str + " is not Palindrome");
        }
    }
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
