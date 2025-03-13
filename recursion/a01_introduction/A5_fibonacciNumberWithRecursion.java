public class A5_fibonacciNumberWithRecursion {
    public static void main(String[] args) {
        // int num =8;
        // System.out.println(fibo(num));

        for(int i =0;i<11;i++){
            int answer =  fibonacciFormula(i);
            System.out.println(answer);
        }
        
    }
    static int fibo(int n){
        if(n<2){
        return n;
        }

        return fibo(n-1)+fibo(n-2);
     

    }

    static int fibonacciFormula(int n){
        
       return (int) ((1/Math.sqrt(5))* (Math.pow((1+Math.sqrt(5))/2,n) - Math.pow((1-Math.sqrt(5))/2,n)));

    
        

     }


     static double fibonacciFormula1(int n){

    
           // also this 2nd term could be ignored, so the function could be written as - 
           return (double) ((1/Math.sqrt(5))* (Math.pow((1+Math.sqrt(5))/2,n)));
            // but this will lead to some mismatch between the numbers
    
         }

     
}



