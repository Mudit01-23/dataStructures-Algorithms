package easy;

public class a09_SumOfDigits {
    public static void main(String[] args) {
        int n =1234;
        //System.out.println(sumOfDigitsWithoutRecursion(n));
        
        System.out.println(sumOfDigitsWithRecursion(n));
    }   
    static int sumOfDigitsWithoutRecursion(int n){
        int sum = 0;
        while(n>0){
            int currentNo = n%10;
            sum = sum+currentNo;
            n = n/10;
        }
        return sum;
    }

    static int sumOfDigitsWithRecursion(int n){
        if(n == 0){
            return 0;
        } 
        return (n%10)+sumOfDigitsWithRecursion(n/10);
    }
    
}
