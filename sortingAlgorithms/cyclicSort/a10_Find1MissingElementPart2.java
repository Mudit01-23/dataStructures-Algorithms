
package cyclicSort;
// this program tells the 1 missing element in an array from 1 to n;
// Important note- in this case we have array from 1 to n, so the correctIndex = value-1, and while finding the missing number, since the index = value-1, then the value will be index +1 ->(nums[j] = j+1), so the comparision will be for(int j = 0, j<nums.length;j++){
// if(nums[j]!= j+1){
//      return j+1;
//          }

// in nums = {3,2,4,1,3}, since 3 is duplicate and 5 is missing so it will find the missing 5 and return it.
//}

public class a10_Find1MissingElementPart2 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};                   // the array is from 1 to n;
        int duplicateElement = findDuplicateElement(nums);
        System.out.println(duplicateElement);
    }    

    static int findDuplicateElement(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]<nums.length && nums[i]!= nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }

        // duplicate number

        for(int j = 0;j< nums.length;j++){
            if(nums[j]!= j+1){
                return j+1;
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
