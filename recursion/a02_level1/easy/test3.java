package easy;

public class test3 {
   // no of 0's in a number
   public static void main(String[] args) {
    int n =2340020;
    int zeros= 0;
    
    System.out.println(fxn(n,zeros));

   }
   static int fxn(int n,int zeros){
    if(n==0){
        return zeros;
    }
    int currentNo = n%10;
    if(currentNo==0){
        zeros++;
    }
    return fxn(n/10,zeros);

   }

    
   
}
