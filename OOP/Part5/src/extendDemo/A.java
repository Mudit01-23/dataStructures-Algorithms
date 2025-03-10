package extendDemo;

public interface A {
    void greet1();

    // the static interface methods will have a body
    static void Greeting(){
        System.out.println("I greet you");
    }
}
