public class A4_Shadowing {
    static int x= 10;// this will be shadowed 
    public static void main(String[] args) {
        System.out.println(x);
        int x = 100;
        System.out.println(x);
    }
}
