package extendDemo2;

public interface B {

   default void unofficialGreeting(){
        System.out.println("UnOfficialGreeting");
    };
}
