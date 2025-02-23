package singleton;

public class Singleton {

    // singleton class can only create 1 object
    private Singleton(){

    }
    private static Singleton instance;

    public static Singleton getInstance(){
        // check if only 1 object is created or not
        if(instance == null){
           instance= new Singleton();
        }
        return instance;
    }
}
