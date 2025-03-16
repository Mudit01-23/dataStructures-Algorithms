package a03_arrayQuestions;

public class a08_LeetCode81_RotatedBinarySearch2 {
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;
        boolean answer = search(nums, target);
        System.out.println(answer);
    }
    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target> nums[mid]){
                start = mid+1;
            }
            else if(target<nums[mid]){
                end = mid -1;
            }
            else {
                return true;
            }

        }
        return false;
    }
}
