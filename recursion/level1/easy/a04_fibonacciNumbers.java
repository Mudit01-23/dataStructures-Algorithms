package easy;

public class a04_fibonacciNumbers {

    // program to print nth fibonacci numbers

    public static void  main(String[] args) {
        int n = 4;
        System.out.println(fibo(n));
    }
    static int fibo(int n){
//         if(n==0){
//             return 0;
         
//     }

//     else if(n==1){
//         return 1;
     
// }

    // better method - 

    if(n<2){
        return n;
    }

    return fibo(n-1)+fibo(n-2);
            
}

}