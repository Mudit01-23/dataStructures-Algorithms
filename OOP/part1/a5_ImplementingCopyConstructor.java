public class a5_ImplementingCopyConstructor {
    public static void main(String[] args) {
        Car car1 = new Car("Bugatti",273,5000000);
        System.out.println("For car1");
        System.out.println(car1.name);
        System.out.println(car1.topSpeed);
        System.out.println(car1.price);

        Car car2 = new Car(car1);
        System.out.println("For car2");
        System.out.println(car2.name);      // here we are creating an object by copying the existing car1 object 
        System.out.println(car2.topSpeed);
        System.out.println(car2.price);

        System.out.println();
        System.out.println("For nested constructor");
        Car car3 = new Car();

        System.out.println("For car3");
        System.out.println(car3.name);
        System.out.println(car3.topSpeed);
        System.out.println(car3.price);



      
}
}
class Car{
    String name;
    int topSpeed;       // these are instance variables
    int price;

    Car(String name, int topSpeed, int price){
        this.name= name;
        this.topSpeed = topSpeed;
        this.price = price;
    }


    // this could also be written like this - 
    // Car(String naam, int gati, int keemat){
    //     this.name= naam;
    //     this.topSpeed = gati;
    //     this.price = keemat;
    //}

    Car(Car copyConstructor){
        this.name = copyConstructor.name;           // implementing copy constructor
        this.topSpeed = copyConstructor.topSpeed; 
        this.price = copyConstructor.price;

          //The copy constructor takes another object of the same class as a parameter and copies its values into the new object.
    }

    // we can call a constructor from other constructor as well
    Car(){
        // this is how you call a constructor from a constructor- 
        this("Aston Martin",300,2500000);
    }


}

