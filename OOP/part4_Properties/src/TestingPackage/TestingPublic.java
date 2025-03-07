package TestingPackage;
import accessModifier.PublicExample;



class TestingPublicSubclass extends PublicExample{

    TestingPublicSubclass(int num,String name){
        super(num,name);
    }




}

public class TestingPublic {


    public static void main(String[] args) {
         //this is in the different package not subclass
//
//        PublicExample obj = new PublicExample();
//        obj.publicMethod();


        // this is in the different package subclass

//        TestingPublicSubclass obj1 = new TestingPublicSubclass(34,"Michael");
//        System.out.println(obj1.num);
//        System.out.println(obj1.name);
//        obj1.publicMethod();
//        obj1.updatePublicVar();
//        System.out.println(obj1.num);

    }

}