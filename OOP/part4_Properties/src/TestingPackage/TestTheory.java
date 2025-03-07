package TestingPackage;

import accessModifier.PublicExample;

 class TestTheoryMethod extends PublicExample {
     TestTheoryMethod(int num,String name){
         super(num,name);
     }

     // making a getter method for the main method outside this class
     protected int getNum(){
         return num;
     }

     public static void main(String[] args) {
         TestTheoryMethod obj1 = new TestTheoryMethod(1,"Test");
         int n = obj1.num; // this is allowed, since the object is of type subclass and
         // it can access the protected member
         System.out.println(n);

         //PublicExample obj2 = new PublicExample(2,"Test2");
        // int n2 = obj2.num; // in other package, not even the object itself which is being
         // extracted by the subclass can access it's member.

    // similarly this will also throw error due to same reason

//         PublicExample obj4 = new TestTheoryMethod(3,"Test");
//         int n2= obj4.num; // it will throw error
     }


}

class TestTheory{

    public static void main(String[] args) {
        TestTheoryMethod obj = new TestTheoryMethod(122,"Testing");
       int n = obj.getNum();
        System.out.println(n);

//        PublicExample obj1 = new PublicExample(1,"Test");
//        int n1=  obj1.num;

    }


}


// we can't access the num because it is protected member,
// for that we have to extend