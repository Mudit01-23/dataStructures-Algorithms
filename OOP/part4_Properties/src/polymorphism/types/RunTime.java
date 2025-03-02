package polymorphism.types;

class Shape1{
    void area(){
        System.out.println("this is the shape class");
    }
}

class Circle1 extends Shape1{
    @Override // this is called an annotation and used for checking purposes
    void area(){
        System.out.println("The area is π* r* r");
    }
}
public class RunTime {
    // this is the example of runtime polymorphism
    public static void main(String[] args) {
        Shape1 obj1 = new Shape1();
        obj1.area();
        Shape1 obj2 = new Circle1();
        obj2.area();
    }
}
