package inheritance.TypesOfInheritance;


class Parent1{
    String name = "Parent1";
    Parent1(){
        System.out.println("This is Parent1 class");
    }
}

class child1 extends Parent1{
    String name = "child1";
    child1(){
        super();
    }
}
class child2 extends Parent1{
    String name = "child2";
    child2(){
        super();
    }
}
class child3 extends Parent1{
    String name = "child3";
    child3(){
        super();
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        child1 obj1 = new child1();
        child2 obj2 = new child2();
        child3 obj3 = new child3();
    }

}
