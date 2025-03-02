package polymorphism;

public class Testing {
    public static void main(String[] args) {
        sum(1,2);
        sum(1,2,3);
        sum(1,2,3,4);
    }

    static void sum(int a,int b){
        System.out.println(a+b);
    }

    static void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    static void sum(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
}
