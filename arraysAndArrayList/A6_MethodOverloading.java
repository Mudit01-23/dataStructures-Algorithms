public class A6_MethodOverloading {
    public static void main(String[] args) {
        // function overloading happens when 2 or more functions of the same name but have different parameters/ arguements

        fun(1);
        fun("Michael");
        fun(4,"Michael");
    }
    
        // here the functions/ methods are overloaded but they have different parameters
    static void fun(String num){
        System.out.println(num);
    }

    static void fun(int num){
        System.out.println(num);
    }
    static void fun(int num,String name){
        System.out.println(num);
    }
}
