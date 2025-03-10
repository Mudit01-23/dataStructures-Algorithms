package extendDemo2;



public class Main implements A,B{



    public static void main(String[] args) {
        Main main1 = new Main();
        main1.officialGreeting();
        main1.unofficialGreeting();
        // the static methods can only be called using the interface name not with
        // the object name
        A.Greeting();
    }
}
