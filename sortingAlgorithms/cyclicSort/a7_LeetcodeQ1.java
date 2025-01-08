package cyclicSort;

import java.util.Arrays;                
// Leetcode 268- Missing number.   
// This program finds the missing number in the array.
// https://leetcode.com/problems/missing-number/description/

public class A1CyclicSortQuestion {
    public static void main(String[] args) {
        //int[] array = {0,3,2,1,4};
        int[] array = {3,0,1};
        int missingNumber = missingNumber(array);
        System.out.println(missingNumber);
    }

    public static int missingNumber(int[] nums) {
   int i = 0;
   while(i<nums.length){
    int correctIndex= nums[i];
    if(nums[i]<nums.length && nums[i] != nums[correctIndex] ){
        swap(nums,i,correctIndex);
    }  
        else{
            i++;
        }

    
   }
   // to find the missing element
   for (int j = 0; j < nums.length; j++) {
    if(nums[j]!= j){
        return j;
    }
   }
   return nums.length;
   

    }
    


    static void swap(int[] array,int num1,int num2){
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
    }
}
