public class a03_atoNandNto1 {
    public static void main(String[] args) {
        int n =5;
        func(n);
    }
    static void func(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        func(n-1);
        System.out.println(n);

    }
}
