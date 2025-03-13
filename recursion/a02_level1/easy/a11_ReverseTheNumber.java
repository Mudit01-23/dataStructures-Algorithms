package easy;

public class a11_ReverseTheNumber {
    public static void main(String[] args) {
        int n =1234;

        // for revNormal and for revUsingRecursion

        // System.out.println(revNormal(n));
        // int reverse = 0;
        // System.out.println(revUsingRecursion(n,reverse));


        // using revUsingRecursion2 method - 
        revUsingRecursion2(n);
        System.out.println(reverse);
    }
    // static int revNormal(int n){
    //     int reverse = 0;
    //     while(n>0){
    //         int currentNo = n%10;
    //         reverse = reverse*10+currentNo;
    //         n = n/10;
    //     }
    //     return reverse;

    // }

    // static int revUsingRecursion(int n, int reverse){
    //     if(n==0){
    //         return reverse;
    //     }
    //      int currentNo = n%10;
    //      reverse = reverse*10+currentNo;
    //     n = n/10;
    //      return revUsingRecursion(n, reverse);
         
    // }

    static int reverse = 0;

    static void revUsingRecursion2(int n){
        // base condition

        if(n==0){
            return;
        }
        int currentNo =n%10;
        reverse = reverse*10+ currentNo;
        revUsingRecursion2(n/10);
    }
}
