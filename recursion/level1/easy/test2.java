package easy;

public class test2 {
    public static void main(String[] args) {
        int n = 12345;
       System.out.println(rev(n));
        
    }

  
    static int rev(int n){
    
       if(n==0){
        return 0;
       }
       
       return (n%10)*helper(n)+rev(n/10);

        
    }

    static int helper(int n){
        int counter = 0;
        while(n>0){
            n = n/10;
            counter++;
        }
        return (int) Math.pow(10,counter-1);
    }

   
}
