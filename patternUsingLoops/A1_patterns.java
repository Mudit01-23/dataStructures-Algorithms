import java.util.Scanner;

public class A1_patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        pattern30(n);
    }



    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
            // how to print star pattern
    static void pattern2(int n){
        for(int row =1;row<=n;row++){
            for(int column =1;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern3(int n){
        for(int i =1;i<=n;i++){
            for (int j = n; j >=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern4(int n){
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    static void pattern5(int n){
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =2;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

   // one more method to do the same question 

   static void pattern5secondMethod(int n){
    for(int row=1;row<=2*n-1;row++){
        // int stars;
        // if(row<=n){
        //     stars = row;
        // }
        // else{
        //     stars = 2*n-row;
        // }
        // this if-else loop can also be written as - 

        int stars = (row<=n)?row:2*n-row;
        for(int column =1;column<=stars;column++){
            System.out.print("*");
        }
        System.out.println();

    }
   }

   static void pattern6(int n){
    for(int row =1;row<=n;row++){
       for(int space = 1;space<=n-row;space++){
        System.out.print(" ");
       }
       for(int column =1;column<=row;column++){
        System.out.print("*");
       }

       System.out.println("");
    }
   }


static void pattern28(int num){
    for(int row=1;row<=2*num-1;row++){
       int stars = (row<=num)?row:2*num-row;

       for(int space =1;space<=num-stars;space++){
        System.out.print(" ");
       }
        for(int column=1;column<=stars;column++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

static void pattern30(int num){
    for (int row = 1; row <= num; row++) {
        // for spaces-

        for(int spaces =1;spaces<=num-row;spaces++){
            System.out.println(" ");
        }

        //for(){}

}




}

}