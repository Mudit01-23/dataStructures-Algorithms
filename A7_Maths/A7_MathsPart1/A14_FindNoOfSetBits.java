
import java.util.Scanner;

public class A14_FindNoOfSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int num = sc.nextInt(); // here we are going to count the number of set bits(1's in it like - 10 = 1010, so 2 set bits)
        // int counter = 0;
        // while(num>0){

        //     if((num&1)==1){
        //         counter+=1;
        //     }
        //     num  = num>>1;
        // }
        // method 2 - 

        int answer=  findSetBits(num);
        System.out.println(answer);

    }
    static int findSetBits(int num){
        int counter = 0;
        while(num>0){
            //num = num&(num-1); // or the other method for calculating could be 
            num=num - (num & -num);
            counter +=1;
        }
        return counter;
    }
}
