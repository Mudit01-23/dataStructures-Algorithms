package staticExample;


public class checking {
    static class testing1{
         static String name;
        public testing1(String name){
            testing1.name = name;
        }

        public String toString(){
            return name;
        }

    }




    public static void main(String[] args) {

        testing1 name1=  new testing1("Michael");
        testing1 name2= new testing1("Kobe");

//        System.out.println(name1.name);
//        System.out.println(name2.name);

        System.out.println(name1);
        System.out.println(name2);
    }
}
