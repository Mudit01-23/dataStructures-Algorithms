package inheritance;

public class Main {
    public static void main(String[] args) {
    /*
     Box box = new Box();

     //System.out.println(box.l + " "+ box.b + " "+ box.h + " ");
        // here it will use default constructor


        // here we are using the constructor with 3 paramters

        Box box1 = new Box(5);
        System.out.println(box1.l + " "+ box1.b + " "+ box1.h + " ");

        // here we are using the copy constructor
        Box box2 = new Box(box1);
        System.out.println(box2.l + " "+ box2.b + " "+ box2.h + " ");

        box1.information();

        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.h + " " + box3.weight);


        System.out.println("BoxWeight box4 = new BoxWeight(5,5,5,15);");
        BoxWeight box4 = new BoxWeight(5,5,5,15);
        System.out.println(box4.weight);


        Box box5 = new Box();
        box5.h = 34;
        System.out.println(box5.h);
       // System.out.println(box5.weight); -> this will throw error, the child class can access the variables/methods/constructors
       // of parent class but the parent class can't access those of child class

     */

       // experiment
       //1-
     //  Box box6 = new BoxWeight(1,2,3,10);
       //System.out.println(box6.h); // it can access height because This works because a child object (BoxWeight)
                                  // can be referenced by a parent class (Box).
       // System.out.println(box6.weight); // but it can't access the weight
        // here we are referencing a parent class to a child class which is possible

        // * it is actually the type of reference variable that actually determines and not the type of the object that
        // determines what members can be accessed.

       //2-
//       BoxWeight box7 = new Box(1,2,3,10);



//        System.out.println(box7.weight);
       // here we are trying to reference a child class to a parent class which is not possible
        // the main issue over here is that although the reference is of type BoxWeight which is childclass, so we should
        // be able to access weight paramter, but we are not able to initialize the weight variable because we've called
        // the constructor of parent class, and parent class has no idea about the weight paramter.

        // the above classes have no idea about what classes are below but the below classes know what classes are
        // above it

        // so we cant have a child reference variable and parent object

    }
}