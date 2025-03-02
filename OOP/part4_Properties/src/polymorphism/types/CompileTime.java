package polymorphism.types;
// this is method overloading and it is compile time or static polymorphism


public class CompileTime {
    public static void mainey(String[] args) {
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
