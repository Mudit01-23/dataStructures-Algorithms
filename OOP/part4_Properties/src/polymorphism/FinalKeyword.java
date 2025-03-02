package polymorphism;

  // final class parentClass{  - this will prevent inheritance
class parentClass{
      // final void printName() - this will prevent the overriding
      void printName(){
        System.out.println("This is parentClass");
    }

}

 class childClass extends parentClass{
    @Override
    void printName(){
        System.out.println("This is childClass");
    }


}
public class FinalKeyword {
    // final keyword is used to create constants
    // but it can also be used to prevent inheritance(if we put final keyword in the parent class- {final class parentClass})
    // and  overriding(if we put final keyword in the method of the parent class that is being overriden by the method
    // of the child class like this - {final void printName()}).


    public static void main(String[] args) {
        parentClass obj = new childClass();
        obj.printName();


    }



}
