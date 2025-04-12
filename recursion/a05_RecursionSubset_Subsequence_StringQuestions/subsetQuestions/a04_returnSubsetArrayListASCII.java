import java.util.ArrayList;

// a04_returnSubsetArrayListASCII.java
 // ascii values- here we are given a string, and we have to make subsets, but here we can also include the ascii values of the characters in the string as well, eg- we are give "ab", here a= 97 and b = 98, now, possible outcomes could be 

public class a04_returnSubsetArrayListASCII { 
   public static void main(String[] args) {
    String u = "ab";
    
    ArrayList<String> ans = fxn(u,"");
    System.out.println(ans);

   }

   static ArrayList<String> fxn(String u,String p){
    
    if(u.isEmpty()){
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;

    }
    char c = u.charAt(0);
    ArrayList<String> left = fxn(u.substring(1),p+c);
    ArrayList<String> mid= fxn(u.substring(1),p+(c+0));
    ArrayList<String> right = fxn(u.substring(1),p);


    left.addAll(mid);
    left.addAll(right);
    return left;
   }
}
