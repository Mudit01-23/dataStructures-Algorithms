public class A3_recursion {
    public static void main(String[] args) {
        print(1);

    }
    static void print(int n){
        if(n>100){
            return;
        }
        System.out.print(n+ " ");
        print(n+1);
    }

}
