package practice;
import java.util.*;

public class copiedOrNot {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s= sc.next();
    String s1 = sc.next();
    s = s.toUpperCase();
    s1 = s1.toUpperCase();

    char arr1[] = s.toCharArray();
    Arrays.sort(arr1);
    char arr2[] = s1.toCharArray();
    Arrays.sort(arr2);

    String res1 = new String(arr1);
    String res2 = new String(arr2);

    if(res1.equals(res2)){
        System.out.println("1");
    }
    else{
        System.out.println("0");
    }

    
    
}    
}
