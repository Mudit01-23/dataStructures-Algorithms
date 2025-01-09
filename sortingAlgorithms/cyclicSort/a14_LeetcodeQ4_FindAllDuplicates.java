package cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class a14_LeetcodeQ4_FindAllDuplicates {
    public static void main(String[] args) {
        //int[] nums = {1,1,2,2,3,3,4,4,5,5};
        int[] nums = {5,4,6,7,9,3,10,9,5,6};
        List<Integer> list = findDuplicates(nums);
        System.out.println(list);

    }

        static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<nums.length){
            int correctIndex = nums[i]-1;

            if(nums[i]!= i+1){
                // check if it's unique
                if(nums[i]!= nums[correctIndex]){
                    swap(nums,i,correctIndex);
                }
                // otherwise add it to the list
                else{
                    if(!list.contains(nums[i])){
                        list.add(nums[i]);
                    }
                    
                }
                i++;   
            }

            else{
                i++;
            }
        }

        return list;
    }

    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }   
}
