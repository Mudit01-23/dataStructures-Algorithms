package polymorphism;
class A{
    void show(){
        System.out.println("In A show ");
    }

    void config(){
        System.out.println("In config ");
    }
}

class B extends A{
    void show1(){
        System.out.println("In B show ");
    }
}
public class Testing {
    public static void main(String[] args) {
//    A obj1 = new A();
//    obj1.show();

    B obj2 = new B(); // the reference is of type Parent Class but the object is of
        // type Child Class.
    obj2.config();



    }
}
