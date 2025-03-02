package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        //Circle circle = new Circle();
        Shapes circle = new Circle(); // it is running the area constructor inside
        // the Circle, whatever the type of object is, that is the only type that will be used
        // ,but we learnt that what method/variable the circle would be able to access depends upon the left hand side, but {in overriding, the type of method that is called depends on what the type of object is}
        // Shapes circle = new Circle();, here the object is of type Circle(), so the area() constructor of Circle class will be called.

        // what is being accessed does not depend on the object type, it depends on the reference variable in the left side.
        Square square = new Square();

        circle.area();

    }
}
