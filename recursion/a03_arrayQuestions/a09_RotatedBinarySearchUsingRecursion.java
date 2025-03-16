package a03_arrayQuestions;

public class a09_RotatedBinarySearchUsingRecursion {
public static void main(String[] args) {
    
        //int[] nums = {5,6,7,8,9,1,2,3};
        //int[] nums = {3,5,1};
        int[] nums = {5,1,3};
        
        
        int target = 5; 
        System.out.println(search(nums,target,0,nums.length-1));

}   
    static int search(int[] nums,int target,int start,int end){

        

        if(start>end){
            return -1;
        }
       

            int mid = start + (end-start)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(nums[start]<=nums[mid]){     // this signifies that the left side is sorted


                // now we are going to check if the target also lies in this range only 

                if(target>=nums[start] && target<=nums[mid]){   

                   return search(nums, target, start, mid-1);  // Search in left half
                }                   
                else{
                            // This block is executed only when the left half is sorted (nums[start] <= nums[mid]), but the target is not present in that left half.
                    
                    return search(nums, target, mid+1, end);    // Search in right half

                }

            }

            // if suppose the left side is not sorted, means nums[start]<=nums[mid] this mean the right hand side must be sorted, Both halves can't be unsorted at the same time, and then we perform checks similar to the above ones for the right hand side- 


          
        
           else if(nums[mid]<=nums[end]){


            if(target>=nums[mid] && target<=nums[end]){ // this signifies that the right side is sorted

                return search(nums, target, mid+1, end);    // Search in right half

            }

           }
           // The last return executes only when the left side is unsorted and the right side is sorted, but the target is in the left side.

            return search(nums, target, start, mid-1);          // Search left
    }       
}



// Leetcode solution - 

/*

  class Solution {
    public int search(int[] nums, int target) {
        return rbs(nums,target,0,nums.length-1);
    }

    static int rbs(int[] nums,int target, int start,int end){

        if(start>end){
            return -1;
        }
       

            int mid = start + (end-start)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(nums[start]<=nums[mid]){

                if(target>=nums[start] && target<=nums[mid]){
                   return rbs(nums, target, start, mid-1);
                }

                else {
                    return rbs(nums, target, mid+1, end);   // edited here
                }

            }

            // if suppose this condition - if(nums[start]<=nums[mid])  is not true, then check if target lies in the second half of the array.

             else if(nums[mid]<=nums[end]){

            if(target>=nums[mid] && target<=nums[end]){
                return rbs(nums, target, mid+1, end);
            }
           }

            // return rbs(nums, target, start, mid-1);
            return rbs(nums, target, start, mid-1);
    }
}
 */