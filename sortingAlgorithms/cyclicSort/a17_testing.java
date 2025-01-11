package cyclicSort;
import java.util.ArrayList;
public class a17_testing {

    // only my testing
    public static void main(String[] args) {
        //int[] nums = {-3,-5,-8,-2,-1,0,1,5,2,9,7};
        int[] nums = {3,4,-1,1};
        
        int firstMissingPositive = firstMissingPositive(nums);
        System.out.println(firstMissingPositive);

    }

    public static int firstMissingPositive(int[] nums) {
        ArrayList<Integer> list = findPositiveElements(nums);
        
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
                }
        

        boolean containsOne = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i]== 1){
                containsOne = true;
            }
        }

        if(containsOne == false){
            return 1;
        }

        int i =0;
        while(i<array.length){
            int correctIndex = array[i] -1;
            if(array[i] > 0 && array[i] <= array.length && array[i] != array[correctIndex]){
                swap(array,i,correctIndex);
            }
            else{
                i++;
            }
        }

        //find the element which is at it's incorrect index, which means that the number belonging to that index is missing
        for(int j = 0;j<array.length;j++){
            if(array[j] != j+1){
                return j+1;
            }
        }

        // if 1 is present in the array and there are every other elements in the array in their correct positions, then return the next element in the array
        return nums.length;
    }


    static ArrayList<Integer> findPositiveElements(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                list.add(nums[i]);
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
