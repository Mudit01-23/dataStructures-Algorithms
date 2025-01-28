public class A2_numberExample {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it, print 1 2 3 4 5 
       printNumber(1);
    }

    static void printNumber(int n){
        System.out.println(n);
        print2(2);
    }

    static void print2(int n){
        System.out.println(n);
        print3(3);
        
    }

    static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    static void print4(int n){
        System.out.println(n);
        print5(5);
    }

    static void print5(int n){
        System.out.println(n);
        
        
    }
}