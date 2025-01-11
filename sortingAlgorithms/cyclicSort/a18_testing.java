package cyclicSort;
// only my testing
public class a18_testing {
    public static void main(String[] args) {
        //int[] nums = {-3,-5,-8,-2,-1,0,1,5,2,9,7};
     int[] nums = {3,4,-1,1};
        
     int firstMissingPositive = firstMissingPositive(nums);
     System.out.println(firstMissingPositive);
    }

     

public static int firstMissingPositive(int[] nums) {
    boolean contains1 = false;

    for (int i = 0; i < nums.length; i++) {
        if(nums[i]== 1){
            contains1 = true;
        }
    }

    if(contains1== false){
        return 1;
    }

    int i =0;
    while(i<nums.length){
        int correctIndex = nums[i] -1;
        if(nums[i]>0 && nums[i]!= nums[correctIndex]){
            swap(nums,i,correctIndex);
        }
        else{
            i++;
        }
    }

    //find the element which is at it's incorrect index, which means that the number belonging to that index is missing
    for(int j = 0;j<nums.length;j++){
        if(nums[j]>0 && nums[j] != j+1){
            return j+1;
        }
    }

    // if 1 is present in the array and there are every other elements in the array in their correct positions, then return the next element in the array
    return nums.length;
}

static void swap(int[] nums,int i,int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

}