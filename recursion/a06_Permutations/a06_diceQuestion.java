import java.util.ArrayList;
// a06_diceQuestion  - here the concept of combinations will be used

public class a06_diceQuestion {
    public static void main(String[] args) {

        int u = 4;
       ArrayList<String> ans= dice("",u);
       System.out.println(ans);
       
    }
    static ArrayList<String> dice(String p, int target){

        ArrayList<String> ans = new ArrayList<>();

        if(target ==0){

            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        for(int i =1;i<=6 && i<= target;i++){

            ans.addAll(dice(p+i,target-i));
        }
        return ans;

    }
}
