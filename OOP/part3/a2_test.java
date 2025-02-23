
class test{
    static String name;
    test(String name){
        test.name = name;
    }
}
public class a2_test {

    public static void main(String[] args) {
       test a = new test("Michael");
       test b = new test("Kobe");

       System.out.println(a.name);
       System.out.println(b.name);
    }

}
