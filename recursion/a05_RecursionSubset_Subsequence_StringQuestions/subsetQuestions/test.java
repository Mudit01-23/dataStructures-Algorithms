import java.util.ArrayList;
public class test {
    public static void main(String[] args) {
        String u = "abc";
        ArrayList<String> ans = fxn(u,"");
        System.out.println(ans);
    }
    static ArrayList<String> fxn(String u,String p){
        
        if(u.length()==0){
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        char c = u.charAt(0);
        ArrayList<String> left = fxn(u.substring(1),p+c);
        ArrayList<String> right = fxn(u.substring(1),p);
        left.addAll(right);
        return left;
        
    }
}
