package inheritance;

public class Box {
    double l;
    double b;
    double h;
    double weight;

    // creating initial constructor
    Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }
    //for cube
    Box( double side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box old){
    this.l = old.l;         // this is A copy constructor
    this.b = old.b;
    this.h = old.h;
    }

    public void information(){
        System.out.println("Running the box");
    }

}
