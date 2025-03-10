public class Main {
    public static void main(String[] args) {

        Son son= new Son(30,2);
        son.career();
        System.out.println(son.value);
        Daughter daughter = new Daughter(27);
        daughter.career();

        Parent mom = new Parent(23) {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }

        };

        System.out.println(mom.age);



        Parent.staticMethod();
        mom.normalMethod();

        // give me the value of final
        System.out.println(mom.value);

    }
}