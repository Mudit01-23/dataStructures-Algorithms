package staticExample;

public class innerClassesPart2 {
    class test{
        String name;
        test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {




        innerClassesPart2 class1 = new innerClassesPart2();
        innerClassesPart2.test a = class1.new test("Michael");
        innerClassesPart2.test b = class1.new test("Kobe");


    }
}
