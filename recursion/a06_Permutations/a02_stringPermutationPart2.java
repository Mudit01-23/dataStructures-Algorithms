import java.util.ArrayList;

public class a02_stringPermutationPart2{
    public static void main(String[] args) {
        
           // a02_stringPermutationPart2 - here instead of making an arraylist and updating it, we will ma

       ArrayList<String> ans = fxn("","abc");
        System.out.println(ans);

    }
    static ArrayList<String> fxn(String p,String u){

        
        if(u.length() ==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        char c = u.charAt(0);
        for(int i =0;i<=p.length();i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

             
             ans.addAll(fxn(f+c+s,u.substring(1)));
        }

        return ans;
    }
    }
    
