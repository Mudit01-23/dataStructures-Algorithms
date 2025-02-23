
 class test{
    String name;
    test(String name){
        this.name = name;
    }
 }

public class a1_test {

    
    public static void main(String[] args) {
        test name1 = new test("Michael");
        test name2= new test("Kobe");

        System.out.println(name1.name);
        System.out.println(name2.name);

        
    }
}

 