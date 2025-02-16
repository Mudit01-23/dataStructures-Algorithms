

public class a3_ConstructorOverloading {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.name = "BMW";
        car1.topSpeed = 100;
        System.out.println(car1.name);
        System.out.println(car1.topSpeed);
        car1.printCarName();


        Car car2= new Car("Mercedes", 200,100000);
        System.out.println(car2.name);
        System.out.println(car2.topSpeed);
        System.out.println(car2.price);
        car2.printCarName();
        
        Car random = new Car(car1);
        System.out.println("Printing for random");
        System.out.println(random.name);   // this is an example of copy constructor
        System.out.println(random.topSpeed);
        System.out.println(random.price);
    }
   
}

class Car{
    String name;
    int topSpeed;
    int price;

    Car(){}
    void printCarName(){
        System.out.println("The name of car is: "+ name);
    }
// here we are perforing constructor overloading, Car() and Car(String name, int topSpeed, int price) are 2 constructors with a same name but different number of arguements

    Car(String name, int topSpeed, int price){
        this.name = name;
        this.topSpeed= topSpeed;
        this.price = price;
    }

    // creating a constuctor that takes values from another object

    Car(Car other){
        this.name = other.name;
        this.topSpeed = other.topSpeed;
        this.price = other.price;
    }

}