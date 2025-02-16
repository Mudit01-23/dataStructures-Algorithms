public class test {
    
    public static void main(String[] args) {
        Car car = new Car();
        Car car1;
        car1 = new Car();
        car1.name = "Mercedes";
        car1.topSpeed = 300;
        car1.price = 500000;

        Car Car2;
        Car2 = new Car();
        Car2.name = "BMW";
        Car2.topSpeed = 400;
        Car2.price  = 700000;

        Car Car3 = new Car();
        Car3.name = "Audi";
        Car3.topSpeed = 270;
        Car3.price = 500000;


        Car car4 = new Car("Bugatti",400,5000000);
        
        System.out.println(car1.topSpeed);
        System.out.println(car1.name);
        System.out.println(car1.price);

        System.out.println();

        System.out.println(Car2.topSpeed);
        System.out.println(Car2.name);
        System.out.println(Car2.price);
        System.out.println();

        System.out.println(Car3.name);
        System.out.println(Car3.topSpeed);
        System.out.println(Car3.price);

        System.out.println(car4.name);
        System.out.println(car4.topSpeed);
        System.out.println(car4.price);



    }
   
}
class Car{
 String name;
 int topSpeed;
 int price;       


 Car(){
    
 }
 Car(String name, int topSpeed,int price){
    this.name =name;
    this.topSpeed = topSpeed;
    this.price= price;

 }
}