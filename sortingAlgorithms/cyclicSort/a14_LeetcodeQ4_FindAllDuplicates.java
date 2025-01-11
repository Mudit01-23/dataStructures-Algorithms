package cyclicSort;
import java.util.ArrayList;
import java.util.ArrayList;
// Leetcode 442. Find All Duplicates in an Array
// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/


public class a14_LeetcodeQ4_FindAllDuplicates{
    public static void main(String[] args) {
        //int[] nums = {5,4,6,7,9,3,10,9,5,6};
        //int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums = {1};
        ArrayList<Integer> list = findDuplicates(nums);
        System.out.println(list);
    }

    static ArrayList<Integer> findDuplicates(int[] nums) {
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            // apply cyclic sort now - 
            if(nums[i] <= nums.length && nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }

        // finding the missing elements
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!= j+1 ){
                list.add(nums[j]);
            }
        }
        return list;

        

    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}



