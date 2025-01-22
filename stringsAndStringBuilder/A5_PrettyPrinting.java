import java.util.ArrayList;

public class prettyPrinting {
    public static void main(String[] args) {
        // how to print float upto some selected number of decimal points

        // float a = 3.234234f;
        // System.out.printf("number upto 4 decimal numbers is- %.4f",a);

        // ********************************************************************

        //System.out.printf("%5f", Math.PI);


        // Placeholders 


        // System.out.printf("Hii my name is %s and am %s","MJ","Great");
        // System.out.println();
        // System.out.printf("%d + %d = %d", Integer.parseInt("1"), Integer.parseInt("1"), Integer.parseInt("2"));
        
         // ********************************************************************

        //  System.out.println('a'+'b'); // it is adding the ascii value of a(97) and b(98)
        //  System.out.println("a"+"b");// just concatenating the strings
        //  System.out.println('a'+3);// ascii value of a = 97, adding 3 and returning the result
        //  System.out.println((char)('a'+3)); // same like above the value is 100, but here we are just converting it into character (typecasting).


         // VERY IMPORTANT POINT
         // When an integer is concatenated with a string, then the integer is converted into it's wrapper class Integer.

        //  System.out.println("a"+3);
        //  // this is same like - 
        //  Integer a = new Integer(3);
        //  System.out.println("a"+a);

// ********************************************************************
        // System.out.println("Michael" + new ArrayList<>());
        // System.out.println("Micheal" + new Integer("1"));


        //System.out.println(new ArrayList<>()+ new Integer("1")); // this will not work, since both are complex objects, there should be atleast one string between them so they could be printed.

        System.out.println(new Integer("1")+ "" + new ArrayList<>()); // here we've added empty string and now it will work
    }
}
