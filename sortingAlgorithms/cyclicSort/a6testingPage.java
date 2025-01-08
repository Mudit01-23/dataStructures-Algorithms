package cyclicSort;
import java.util.ArrayList;
public class testingPage {
    public static void main(String[] args) {
          int[] nums = {0,1,2,3,4,5,6,7,8,9,10};
          ArrayList<Integer> list = findEvenNumbers(nums);
          System.out.println(list);
    }
    static ArrayList<Integer> findEvenNumbers(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i%2==0){
                list.add(i);
            }
        }
        return list;
    }
    
}
