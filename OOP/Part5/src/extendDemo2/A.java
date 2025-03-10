package extendDemo2;

public interface A {
    default void officialGreeting(){
        System.out.println("officialGreeting");
    }

    static void Greeting(){
        System.out.println("I greet you");
    }
}
