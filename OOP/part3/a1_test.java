
 class test1 {
    static String name;
    test1(String name){
        this.name = name;
    }
 }

public class a1_test {

    
    public static void main(String[] args) {
        test1 name1 = new test1("Michael");
        test1 name2= new test1("Kobe");

        System.out.println(name1.name);
        System.out.println(name2.name);

        
    }
}

 