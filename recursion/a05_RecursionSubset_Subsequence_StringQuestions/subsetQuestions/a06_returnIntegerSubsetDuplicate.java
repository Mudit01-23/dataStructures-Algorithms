import java.util.ArrayList;
// a06_returnIntegerSubsetDuplicate
// this is the best way to solve this subset of number problem as well as the duplicate problem, just declare static list and check if it contains the string before, then skip it.

public class a06_returnIntegerSubsetDuplicate {
     public static void main(String[] args) {
        int[] u = {1,2,2}; // this also work 
        
        ArrayList<String> ans = fxn(u,"",0,u.length-1);
        System.out.println(ans);
    }
   static ArrayList<String> list = new ArrayList<>();

    static ArrayList<String> fxn(int[] u,String p,int start, int end){

        
        if(start==u.length){
            if(!list.contains(p)){
                list.add(p);
            }     
            return list;     
        }

        int c = u[start];

         fxn(u,p+c,start+1,end);
         fxn(u,p,start+1,end);

        return list;
    }
}
