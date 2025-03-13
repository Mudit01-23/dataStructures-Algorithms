package easy;

public class a07_factorial {

    // using recursion
    public static void main(String[] args) {
        int n =0;
        
        //System.out.println(factWithRecursion(n));
        System.out.println(factWithoutRecursion(n));
    }



    static int factWithRecursion(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n* factWithRecursion(n-1);

    }



    static int factWithoutRecursion(int n){
        
        int answer= 1;
        for(int i =n;i>0;i--){
            answer = answer*i;
        }

        return answer;
    }
}
