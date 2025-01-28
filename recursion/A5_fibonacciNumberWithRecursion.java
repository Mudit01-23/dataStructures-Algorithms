public class A5_fibonacciNumberWithRecursion {
    public static void main(String[] args) {
        int num =8;
        System.out.println(fibo(num));
        
    }
    static int fibo(int n){
        if(n<2){
        return n;
        }

        return fibo(n-1)+fibo(n-2);
     

    }
}
