package singleton;
// use of singleton class is that if we want to have only 1 object of a particular
// thing then use singleton class
public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // all 3 reference variables are pointing to one object
    }

}
