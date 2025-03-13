package easy;

public class test {
  public static void main(String[] args) {
    int reverse = 0;
   // System.out.println(rev(12345,reverse));
    System.out.println(revUsingHelperFxn(12345));
  }
    static int rev(int n,int reverse){
       if(n==0){
        return reverse;
       }

       int currentNo= n%10;
       reverse = reverse*10+currentNo;
       n = n/10;
       return rev(n,reverse);
    }

    static int revUsingHelperFxn(int n){
        int base = 0;

    }

    static int helper(){
        for(int i =0){}
    }
}
