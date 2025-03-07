package inheritance;
// here we are creating A box which will inherit the parameter of box and has
// its own parameter weight
public class BoxWeight extends Box {
    // here BoxWeight class is inheriting the box's properties
    double weight;
    BoxWeight(){
        this.weight = -1;
    }


//    BoxWeight(double l, double b, double h, double weight){
////        this.l =l ;
////        this.b =b ;
////        this.h =h ;  // this is the wrong way to define these parameters of Box class, instead use super keyword
//
//        super(l,b,h); // this super is calling this constructor in Box class in Box.java
//                                                                // Box(double l, double b, double h){
//                                                                //        this.l = l;
//                                                                //        this.b = b;
//                                                                //        this.h = h;
//                                                                //    }
//
//        // means it is calling the parent class constructor
//        this.weight =weight ; // this is being initialized normally
//        // here this keyword is refering to  the weight variables of the BoxWeight class.
//
//        super.weight = weight; // here the super keyword is referring to the weight variable in the Box super class.
//
//    }



    BoxWeight(double l,double b, double h){
        super(l,b,h);
    }

    BoxWeight(BoxWeight other){
        super(other);
       this.weight = other.weight;
    }

}
