package a03_arrayQuestions;

public class a07_RotatedBinarySearchWithDuplicates {
   
    public static void main(String[] args) {
        
       
        int[] array = {3,5,5,1,1};
        
        
        int target = 1; 
        System.out.println(search(array,target));
    }

    
    static int search(int[] nums, int target){
        int pivot =  findPivotWithDuplicateElements(nums);
        // if we don't have a pivot, it means that array is not rotated. then run the normal binary search
        if(pivot ==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        else if(nums[pivot]==target){
            return pivot;
        }
        else if(target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        else{ // for if(target<nums[0])
            return binarySearch(nums,target,pivot+1,nums.length-1 );
        }


    }


    static int findPivotWithDuplicateElements(int[] nums){
        // 4 cases to find the pivot

        int start =0;
        int end = nums.length-1;


        while(start<=end){
            int mid = start + (end-start)/2;
            
            
            if( mid>start && nums[mid-1]>nums[mid]){
                return mid-1;
            }

             if( mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            // if we have duplicates then we can skip them
             if(nums[mid]== nums[start] && nums[mid] == nums[end]){

                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;


                if(nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
             }

             else if(nums[start]<nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
                start = mid+1;
             }
             else{
                end = mid-1;
             }
           
        }

        return -1;
    }

    static int binarySearch(int[] nums, int target,int start,int end){
       
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target>nums[mid]){
                start = mid+1;
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
