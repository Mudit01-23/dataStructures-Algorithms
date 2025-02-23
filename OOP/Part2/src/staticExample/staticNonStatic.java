package staticExample;

public class staticNonStatic {
    public static void main(String[] args) {
        fun();

    }
    static void fun(){
        System.out.println("I'm doing fun");
        //greeting(); // this will not work since we can't call a non
        // static method inside a static method.
        staticNonStatic obj = new staticNonStatic();
        obj.greeting();

    }
    void greeting(){
        System.out.println("Hello there");
    }
     void fun2(){
        staticNonStatic obj = new staticNonStatic();
        obj.greeting();
    }

}

