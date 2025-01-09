package cyclicSort;

// 287. Find the Duplicate Number 
// https://leetcode.com/problems/find-the-duplicate-number/description/

// in this question, the array is from 1 to n, and there is 1 duplicate element, find that element.

// this is my attempt, which is also accepted in leetcode and working

public class a12_LeetcodeQ3OptimisedMethod {
    public static void main(String[] args) {
        int[] nums = {1,3,3,2,4};
        int duplicateElement = findDuplicateElement(nums);
        System.out.println(duplicateElement);
    }


    
        static int findDuplicateElement(int[] nums) {
            int i = 0;          
            while(i<nums.length){ 
                int correctIndex= nums[i] -1;   // since the element are from 1 to n, so index = (value)nums[i]-1; and value = index+1;
    
                // first we will check that the element is at it's correct index or not
                if(nums[i]!= i+1){
    
                // since the element is not in it's correct position therefore, we have 2 conditions, there could be 2 cases 
    
                // 1- element is unique -> then swap it with it's correctIndex
                if(nums[i] != nums[correctIndex]){
                    swap(nums,i,correctIndex);
                }
                // 2- element is duplicate -> return it because that is the answer
                else{
                    return nums[i];
                 }
                }   
                // and if the element is at it's correct position means nums[i] == i+1; then move forward
    
               else{
                i++;
                }   
            }
            // since there are no duplicate elements found, so return -1
            return -1;
            
        }
    
        static void swap(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    
}
