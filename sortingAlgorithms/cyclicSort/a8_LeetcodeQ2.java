package cyclicSort;
import java.util.Arrays;
import java.util.ArrayList;
public class LeetCodeQ2 {
    public static void main(String[] args) {
        int[] nums = {4,4,3,3,2,2,7,7,8,8,2,2,3,3,1,1};
        System.out.println(Arrays.toString(nums));
        
        ArrayList<Integer> list = findMissingNumber(nums);
        System.out.println(list);
    }
    static ArrayList<Integer> findMissingNumber(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex= nums[i]-1;
            if(nums[i]!= nums[correctIndex]){
                swap(nums,i, correctIndex);
            }
            else{
                i++;
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!= j+1){
                list.add(j+1);
            }
        }

        return list;
    }


    static void swap(int[] nums,int i, int correctIndex){
        int temp = nums[i];
        nums[i]= nums[correctIndex];
        nums[correctIndex] = temp;
    }
}
