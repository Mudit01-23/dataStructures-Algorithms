package inheritance;

class Parent{
    Parent(){}
    String ParentFirstName;
    String ParentMiddleName ;
    String ParentLastName;
    int property;
    int numberOfChild;


    Parent(String ParentFirstName, String ParentMiddleName, String ParentLastName,int property, int numberOfChild ){
        this.ParentFirstName = ParentFirstName;
        this.ParentMiddleName = ParentMiddleName;
        this.ParentLastName = ParentLastName;
        this.property = property;
        this.numberOfChild = numberOfChild;

    }

    Parent(String ParentFirstName){
        this.ParentFirstName = ParentFirstName;
    }




}

class Child extends Parent{


 String childFirstName;
 String childMiddleName;
 String childLastName;
 int childNo;


   Child(String ParentFirstName,int childNo,String childFirstName,String childLastName,String childMiddleName)
   {
    super(ParentFirstName);
    this.childNo = childNo;
    this.childFirstName = childFirstName;
    this.childMiddleName = childMiddleName;
    this.childLastName= childLastName;



}

}

public class testing {
    public static void main(String[] args) {
    Parent obj1=  new Parent("John","F","Kennedy",1000,5);

    Child obj2 = new Child("John",1,"Donald","J","Trump");

    }
}



