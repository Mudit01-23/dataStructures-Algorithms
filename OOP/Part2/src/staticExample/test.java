package staticExample;

// class test1{
//    static String name;
//    test1(String name){
//        test1.name = name;
//    }
//
//}

public class test{
    // the meaning of making the test class static means that test1 class does not
    // depend on the objects of test class.


//    static class test1{
//        static String name; // everything depends upon this, if this is static means i
//        // it depends on class and not of object,
//       public test1(String name){
//            test1.name = name;
//        }
//
//    }

    // Also one more thing could be done, instead of declaring test1 as static, we
    // can create object of class test.


         public class test1{
          String name; // everything depends upon this, if this is static means i
        // it depends on class and not of object,
       public test1(String name){
            this.name = name;
        }

    }

    public static void main(String[] args) {
    test outerClass = new test(); // creating object of outer class
     test1 name1 = outerClass.new test1("Michael");
     test1 name2 = outerClass.new test1("Kobe");

            // test obj1 = new test test.test1("Michael");

//        test1 name1=  new test1("Michael");
//        test1 name2= new test1("Kobe");
//
        System.out.println(name1.name);
        System.out.println(name2.name);
    }
}
