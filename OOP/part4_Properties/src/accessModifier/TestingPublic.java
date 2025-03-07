package accessModifier;
class PublicExampleInheritance extends PublicExample{
    PublicExampleInheritance(int num, String name){
        super(num,name);
    }
}
public class TestingPublic {
    public static void main(String[] args) {



        PublicExampleInheritance obj2=  new PublicExampleInheritance(25,"Shaq");

        System.out.println(obj2.num);
        System.out.println(obj2.name);

        PublicExample obj1 = new PublicExample(1,"test");
        int a = obj1.num;
        System.out.println(a);



    }
}
