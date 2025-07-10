import java.util.ArrayList;

// not sure if it is correct, but here i've taken this processed arugement as well in the function whereas in the question there is only 1 variables that is unprocessed


public class a04_PhoneNoPermutation { 
    public static void main(String[] args) {
        String u = "23456789";
        ArrayList<String> ans = fxn("",u);
        System.out.println(ans);
    }
    static ArrayList<String> fxn(String p,String u){

        if(u.length()==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char c = u.charAt(0);
        
        for(int i=0;i<=p.length();i++){

            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            
            ans.addAll(fxn(f+c+s,u.substring(1)));
        }
        return ans ;
    }
}
