public class test{
    public static void main(String[] args) {
        
        //int[] nums = {5,6,7,8,9,1,2,3};
        //int[] nums = {3,5,1};
        int[] nums = {5,1,3};
        
        
        int target = 5; 
        System.out.println(search(nums,target,0,nums.length-1));
    }


    static int search(int[] nums,int target,int start,int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(nums[mid]== target){
            return mid;
        }

        // check if 
    }
}