package cyclicSort;

// 287. Find the Duplicate Number 
// https://leetcode.com/problems/find-the-duplicate-number/description/

// in this question, the array is from 1 to n, and there is 1 duplicate element, find that element.

// this is also similar to the leetcode 287, where we have to find the duplicate element of an array with elements from 1 to n, what if the elements were 0 to n-1

public class a13_LeetcodeQ3Modified {
    public static void main(String[] args) {
        int[] nums = {1,0,0,2,4};
        int duplicateElement = findDuplicateElement(nums);
        System.out.println(duplicateElement);
    }

    static int findDuplicateElement(int[] nums){

        int i = 0;
        while(i<nums.length){
        // since here we are dealing with numbers from 0 to n-1, so index = value
        int correctIndex = nums[i];
        // first check- if elements are present are in their correct index or not, here element = value
        // i- element is not present at it's correct index
        if(nums[i] != i){
            // 2 conditions- element is unique or duplicate
            // i- is unique
            if(nums[i]!= nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            // ii- is duplicate
            else{
                return nums[i];
            }
        }
        // ii- element is present at it's correct index, then skip it and move forward.
        else{
            i++;
        }
        }
        return -1;
    }

    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
