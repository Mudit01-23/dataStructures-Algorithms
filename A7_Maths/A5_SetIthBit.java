import java.util.Scanner;
public class A5_SetIthBit {
    public static void main(String[] args) {
        // if the ith bit is 1 keep it as it is, if it is 0, then make it 1
        // we can use OR operation for doing the same, 1 OR 1 = 1, 0 OR 1 = 1.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.println("Enter the ith bit that you want to set to 1");
        int i = sc.nextInt();

       int ithBitBeforeChange = (number & (1<<i-1)) >>i-1;

       int changedNumber = number | (1<<i-1);
       int ithBitAfterChange =( changedNumber & (1<<i-1)) >> i-1;

       System.out.println("The ith bit before change is: "+ ithBitBeforeChange+ " and ith bit after change is : "+ ithBitAfterChange+ " and the changed number is: "+ changedNumber);

        // the ith bit in the number _ before change  is = _, and ith bit in the number is _ and the number becomes = 

        // first check and print the ith bit, after that add the change to the answer and print the other line. 

    }
}
