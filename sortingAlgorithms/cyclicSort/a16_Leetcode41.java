package cyclicSort;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
// Leetcode 41. First Missing Positive
// https://leetcode.com/problems/first-missing-positive/



public class a16_Leetcode41 {
    public static void main(String[] args) {
        int[] nums=  {1,2,0};

   int firstMissingPositive = firstMissingPositive(nums);
   System.out.println(firstMissingPositive);
    }
     static int firstMissingPositive(int[] nums) {

        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i] -1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!= nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }

        // find the missing element
        for (int j = 0; j < nums.length; j++) {
            if( nums[j]!= j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}



