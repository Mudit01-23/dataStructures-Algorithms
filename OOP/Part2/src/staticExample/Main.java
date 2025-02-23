package staticExample;

public class Main {
    public static void main(String[] args) {
        Human h1= new Human("Michael",34,5000000,false);
        System.out.println(Human.population);
        Human h2= new Human("Kobe",38, 1000000, true);
        System.out.println(Human.population);
        Human h3= new Human("Shaq",38, 1000000, true);
        System.out.println(Human.population);

//        System.out.println(h1.name);
//        System.out.println(h1.age);
//        System.out.println(h1.salary);
//        System.out.println(h1.maritalStatus);
//        System.out.println(h1.population);
//        System.out.println(h2.population);

    }
}
