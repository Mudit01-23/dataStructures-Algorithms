public abstract class Parent {

    int age;
    final int value;
    int testValue;
    int test;

    Parent(int age){
        this.age = age;
        value = 234;
    }
// either only make 1 constructor and define the final variable inside it or
// if you make multiple constructors then you have to define that final variable
    // in every one of those.
    Parent(int testValue,int test, int value){
        this.test = test;
        this.testValue= testValue;
        this.value = value;
    }

    Parent(int test,int value){
        this.test = test;
        this.value = value;
    }
    abstract void career();  // abstract method
    abstract void partner();  // abstract method


    // adding a static method

    static void staticMethod(){
        System.out.println("This is a static method");
    }

    void normalMethod(){
        System.out.println("This is a normal method");
    }
}
