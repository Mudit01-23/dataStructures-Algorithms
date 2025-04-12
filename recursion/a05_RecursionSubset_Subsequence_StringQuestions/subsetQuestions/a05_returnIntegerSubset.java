import java.util.ArrayList;
public class a05_returnIntegerSubset {
    // a05_returnIntegerSubset
    // here we are trying to return the subset iteratively, instead of using recursion.
    public static void main(String[] args) {
        int[] u = {1,2,2};
        
        ArrayList<String> ans = fxn(u,"",0,u.length-1);
        System.out.println(ans);
    }

    static ArrayList<String> fxn(int[] u,String p,int start, int end){

        
        if(start==u.length){
            
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int c = u[start];

        ArrayList<String> left = fxn(u,p+c,start+1,end);
        ArrayList<String> right = fxn(u,p,start+1,end);

        left.addAll(right);
        return left;
       
    }
}
