package polymorphism;
class parent{
//    parent(){
//        System.out.println("This is A parent class");
//    }
static void greeting(){
        System.out.println("Greeting from parent class");
    }
}


class child extends parent{

    static void greeting(){
        System.out.println("Greeting from the child class");
    }
}
public class OverridingStatic {
    public static void main(String[] args) {

//        parent obj = new parent();
//        obj.greeting();

//child obj = new child();
//obj.greeting();


        parent obj = new child();
        obj.greeting(); // it is we getting the output of greeting() of parent class
        // instead of the child class, means it is not overriding


        // static methods can't be overridden because there is no point in overriding them in the
        // child class because the method in the parent class will always run no matter
        // from which object we call it.

        // overriding depends upon objects and static does not depend on the object and
        // so the static methods can't be overridden.
    }

}
