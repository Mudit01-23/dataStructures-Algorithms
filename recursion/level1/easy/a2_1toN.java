
//program to print number from 1 to n without using recursion

// public class a2_1toN {
// public static void main(String[] args) {
//     int n = 10;
//     func(n);
// }    


// static void func(int n){
//     int counter =1;

//     while(counter<n+1){
//         System.out.println(counter);
//         counter++;
//     }
    
   

// }

//}


//program to print number from 1 to n using recursion

// public class a2_1toN{
//     public static void main(String[] args) {
//         int n = 5;
//         func(1,n);
//     }

//     static void func(int counter, int n){
//         if(counter == n+1){
//             return;
//         }
//         System.out.println(counter);
//         counter++;
//         func(counter,n);
//     }
// }



public class a2_1toN{
    public static void main(String[] args) {
        int n = 17;
        func(n);
    }

    static void func(int n){
        if(n==0){    
            return;
        }
        
        func(n-1);
        System.out.println(n);
    }
}
