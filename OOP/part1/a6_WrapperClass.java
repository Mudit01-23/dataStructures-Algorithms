public class a6_WrapperClass {
    public static void main(String[] args) {
        // Integer num = new Integer(19);
        // System.out.println(num);

        // the function of wrapper class is to convert primitive into object
        // very important concept - 

        int a = 1;
        int b = 2;
        System.out.println("a= "+a+",b= "+b);
        swap(a,b);
        System.out.println("a= "+a+",b= "+b);
        // here a and b are not swapped because there is no pass by reference for primitives  in java, it is pass by value, here int swap(a,b) the value 1 and 2 are being passed respectively not the address to a &b


        // but this changes if we convert them into objects,
        Integer c = 1;
        Integer d= 2;

        System.out.println("c= "+c+",d= "+d);
        swap(c,d);
        System.out.println("c= "+c+",d= "+d);

        // the values will still not swap, because the integer class is a final class.
    }

    static void swap(Integer a,Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}
