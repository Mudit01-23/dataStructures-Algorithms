package staticExample;

public class innerClasses {

     static class test{
         String name;
        test(String name){
        // this will print Michael and Kobe normally
            this.name = name;
        }
    }

    public static void main(String[] args) {


        test a = new test("Michael");
        test b = new test("Kobe");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
