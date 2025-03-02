package inheritance.TypesOfInheritance;
class GrandParent {
    String grandParentName;
    GrandParent(String grandParentName){

        System.out.println("This is the GrandParent class");
        this.grandParentName = grandParentName;
    }

}
class Parent extends GrandParent {
    String ParentName;
    Parent(String grandParentName, String ParentName){
        super(grandParentName);
        System.out.println("This is the Parent class ");
        this.ParentName= ParentName;
    }
}

class Child extends Parent{
    String ChildName;
    Child(String grandParentName, String ParentName,String ChildName){
        super(grandParentName, ParentName);
        System.out.println("This is the Child clas ");
        this.ChildName = ChildName;
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        GrandParent obj1 = new GrandParent("GP");
        System.out.println(obj1.grandParentName);
        System.out.println();
        Parent obj2 = new Parent("GP","P");
        System.out.println(obj2.grandParentName);
        System.out.println(obj2.ParentName);
        System.out.println();
        Child obj3 = new Child("GP","P","C");
        System.out.println(obj3.grandParentName);
        System.out.println(obj3.ParentName);
        System.out.println(obj3.ChildName);

    }
}
