package cyclicSort;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
// leetcode 645 - Set Mismatch
// https://leetcode.com/problems/set-mismatch/description/



public class a15_Leetcode645 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        
        int[] array = solution(nums);
        System.out.println(Arrays.toString(array));
    }

    static int[] solution(int[] nums) {
        int i = 0;
        int[] array = new int[]{0,0};
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            // apply cyclic sort now - 
            if(nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }

        // finding the duplicate and missing element
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!= j+1 ){
                array[0]= nums[j];   // duplicate element 
                array[1]= j+1; // missing element
            }
        }
        return array;

        

    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}



