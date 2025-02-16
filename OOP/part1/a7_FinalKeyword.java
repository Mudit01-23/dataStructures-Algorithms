public class a7_FinalKeyword {
    public static void main(String[] args) {
        final int INCREASE = 2;
        // INCREASE = 3; // this will give error, 
        //When a variable is declared as final, its value cannot be changed after initialization.

        System.out.println(INCREASE);

        
        // one more important point is that the final keyword holds it's immutablity only when the instance variables are primitive datatype not reference type or object type,if the datatype is object it can be modified
        // eg-
        Student1 student1 = new Student1("Michael");
        System.out.println(student1.name);
       // student1.name = "Kobe Bryant";    this will give error because the instance variable is declared as final
        

       //
       final Student2 student2  = new Student2("Michael");
       student2.name = "Kobe Bryant";// this is allowed
       // but this is not allowed- because when an object is final, you cannot reassign it, you can change the values but you can't reassign it.
      // student2 = new Student("Kobe");

    }
}
class A{
   //  final int num;  // // Always initialize the final variable when it is decalred because you can't change it.

   // so it will be like this - 
     final int num = 10;
}
class Student1{
     final String name;
    Student1(String name){
        this.name = name;
    }
}

class Student2{
     String name;
   Student2(String name){
       this.name = name;
   }
}