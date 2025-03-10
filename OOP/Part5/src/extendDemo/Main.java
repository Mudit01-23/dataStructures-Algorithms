package extendDemo;

public class Main implements B{


   public void greet1(){
       System.out.println("Hi GoodMorning ");
   }
    public void greet2(){
        System.out.println("Hey, Wassup");
    }


    public static void main(String[] args) {
        Main main1 = new Main();
        main1.greet1();;
        main1.greet2();

//         the static interface methods will have a body and could be called using the
//         interface name only unlike in classes where we had an option of whether to
//         call the static method by object name or the class name
        A.Greeting();
    }
}
