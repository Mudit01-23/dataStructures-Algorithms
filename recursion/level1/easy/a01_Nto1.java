

public class a01_Nto1 {
    public static void main(String[] args) {
        int num = 5;
        func(num);

    }
    static void func(int num){
        if(num==0){
           // System.out.println("1");
            return;


        }
        System.out.println(num);
       
            func(num-1);
       
         
    }
}
