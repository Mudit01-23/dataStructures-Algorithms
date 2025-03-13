package easy;

public class a13_NoOf0InNumber {
    public static void main(String[] args) {
        int n = 20040050;
        int num = 0;
        if(n==0){
            System.out.println(1);
            return;
        }
        System.out.println("No of 0's: "+ noOfZero(n,num));

    }
    static int noOfZero(int n,int num){
        if(n==0){
            return num;
        }
        int currentNo = n%10;
        
        if(currentNo==0){
            num++;
        }

        return noOfZero(n/10, num);

    }
}
