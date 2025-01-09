package cyclicSort;
// 287. Find the Duplicate Number 
// https://leetcode.com/problems/find-the-duplicate-number/description/

// in this question, the array is from 1 to n, and there is 1 duplicate element, find that element

// this is my attempt, which is also accepted in leetcode and working

public class a11_LeetcodeQ3 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,4,5,3};
        int duplicateElement = findDuplicateElement(nums);
        System.out.println(duplicateElement);
    }

    static int findDuplicateElement(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]< nums.length && nums[i]!= nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }

        }
        // finding the duplicate Element
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!= j+1){
                return nums[j];
            }
        }
        return -1;
    }

    static void swap(int[] nums,int i,int j){
        int temp= nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}



// this is one more method to solve this question, 
