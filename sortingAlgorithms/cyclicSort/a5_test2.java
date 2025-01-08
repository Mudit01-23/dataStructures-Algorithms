package cyclicSort;

import java.util.Arrays;

public class test2 {
   public static void main(String[] args) {
    // writing cyclicSort Code without help and combining both when array starts from 1 or 0;    
     //int[] nums = {3,2,1,5,4,0};
     int[] nums = {3,2,1,5,4};
     System.out.println(Arrays.toString(nums));
    cyclicSort(nums);
    System.out.println(Arrays.toString(nums));
    }

    static void cyclicSort(int[] nums){
        int i = 0;
        boolean containsZero = false;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]==0){
                containsZero= true;
                break;
            }
        }

        
        while(i<nums.length){
            int correctIndex = 0;
            if(containsZero== true){
                correctIndex = nums[i];
            }
            else{
                 correctIndex = nums[i]-1;
            }
            
            if(nums[i]!= nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] nums, int a,int b){
        int temp = nums[a];
        nums[a]= nums[b];
        nums[b]= temp;
    }
}
