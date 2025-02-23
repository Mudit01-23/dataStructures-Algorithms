

public class a4_ListOfPrimeNumbersPart2 {
    public static void main(String[] args) {
        
        for(int i =2;i<=40;i++){
            if( isPrime(i)){
                System.out.print(i+ ",");
            }
        }
        
        
    }
    static boolean isPrime(int n){
        for(int i =2;i*i<=n;i++){ // or i<= Math.sqrt(n);
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    // or this can also we written as- 

    static boolean isPrimeSecondMethod(int n){
        int i =2;
        while(i*i<=n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
