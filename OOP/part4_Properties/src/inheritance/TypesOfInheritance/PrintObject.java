package inheritance.TypesOfInheritance;
class print{
    int num;

    public print(int num) {
        this.num = num;
    }


     String tonum(){
        return ""+ num;
    }
}




public class PrintObject {

    public static void main(String[] args) {
        print obj = new print(23);
        System.out.println(obj);
    }
}
