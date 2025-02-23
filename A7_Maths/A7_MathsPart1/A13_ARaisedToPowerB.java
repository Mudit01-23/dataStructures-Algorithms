import java.util.Scanner;
public class A13_ARaisedToPowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        //int answer  = method1(number,power); // Method 1
        //int answer = (int)(Math.pow(number,power));  // Method 2
        int answer  = method2(number,power); // Method 3
        System.out.println(answer);
    }
    static int method1(int number, int power){
        int result = 1;
       for(int i =0;i<power;i++){
        result = result*number;
       }
       
        return result;
    }

    static int method2(int base,int power){
        int answer =1;
        while(power>0){
            if((power & 1)== 1){
                answer = answer*base; 
            }
            base = base*base;
            power = power>>1;
        }
        return answer;
    }
}
