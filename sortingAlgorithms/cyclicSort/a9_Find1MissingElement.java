package cyclicSort;
// this program tells the 1 missing element in an array from 0 to n-1;

public class a9_Find1MissingElement {
    public static void main(String[] args) {
        int[] nums = {5,1,3,4,2};                   // the array is from 0 to n-1;
        int duplicateElement = findDuplicateElement(nums);
        System.out.println(duplicateElement);
    }    

    static int findDuplicateElement(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i];
            if(nums[i]<nums.length && nums[i]!= nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }

        // duplicate number
        for(int j = 0;j< nums.length;j++){
            if(nums[j]!= j){
                return j;
            }
        } 

        return nums.length;
    }

    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
