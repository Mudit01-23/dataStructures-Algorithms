import java.util.ArrayList;
// here we are returning the permutations of a string using a static method
public class a01_stringPermutation {
    public static void main(String[] args) {
        String u = "ab";
         fxn(u,"");
         System.out.println(list);
        

        
    }
static ArrayList<String> list = new ArrayList<>();

    static void fxn(String u,String p){

        if(u.isEmpty()){
            list.add(p);
            return;
        }

        char ch = u.charAt(0);

        for(int i=0;i<= p.length();i++){

            String f =p.substring(0,i);
            String s = p.substring(i,p.length());

            fxn( u.substring(1),f+ch+s);

        }
    }
}
