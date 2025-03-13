package easy;

public class a14_Leetcode1342 {
    public static void main(String[] args) {
        int n =8;
         System.out.println(numberOfSteps(n));
        
    }

    public static int numberOfSteps(int num) {

        return fxn(num);
    }

    static int fxn(int num){
        int counter = 0;
        return steps(num,counter);
        
    }
    
    static int steps(int n,int counter){

         if(n==0){
            return counter;
         }

        if((n&1)==1){
            
            return steps(n-1, ++counter);
        }
        else{
            
            return steps(n/2,++counter);
        }

    }
}
