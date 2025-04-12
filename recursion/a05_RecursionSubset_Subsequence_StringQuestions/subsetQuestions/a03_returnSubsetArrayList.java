import java.util.ArrayList;

public class a03_returnSubsetArrayList {
    /* 
    // Method 1- here we are making a static arraylist and then whenever we reach base condition, we are adding the processed portion in this arraylist

    public static void main(String[] args) {

     String u = "abc"; // unprocessed
     String p = "";     // processed
     ArrayList<String> ans = fxn(u,p);
     System.out.println(ans);

    } // here we are 
    static ArrayList<String> list = new ArrayList<>();

    static ArrayList<String> fxn(String u, String p){

        if(u.length()==0){
             list.add(p);
             return list;
        }
        char c = u.charAt(0);
        fxn(u.substring(1),p+c);
        fxn(u.substring(1),p);
        
        return list;
    }

   */



   // Method 2- in this method we are making an arrayList inside the function, and making new arrayList with every call, and then combining the returned value from the previously returned function call.

   public static void main(String[] args) {
    String u = "abc";
  String p = "";
  ArrayList<String> ans = fxn(u,p);
  System.out.println(ans);
 }


 static ArrayList<String> fxn(String u, String p){
 
 
 if(u.length()==0){
     ArrayList<String> list = new ArrayList<>();
     list.add(p);
     return list;
 }

 char c = u.charAt(0);
 ArrayList<String> right = fxn(u.substring(1),p);
 ArrayList<String> left = fxn(u.substring(1),p+c);
 
 left.addAll(right);
     return left;
 
 
 }
}
