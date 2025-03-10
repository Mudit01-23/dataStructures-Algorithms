
class test2 {
    static String name;
    test2(String name){
        test1.name = name;
    }
}
public class a2_test {

    public static void main(String[] args) {
       test1 a = new test1("Michael");
       test1 b = new test1("Kobe");

       System.out.println(a.name);
       System.out.println(b.name);
    }

}
