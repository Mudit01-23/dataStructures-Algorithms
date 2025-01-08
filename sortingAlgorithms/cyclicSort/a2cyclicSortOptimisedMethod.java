package cyclicSort;

import java.util.Arrays;
public class cyclicSortOptimisedMethod{
    public static void main(String[] Args){
        int[] array = {5,3,4,2,1,3};
        
        System.out.println(Arrays.toString(array));
        cyclicSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void cyclicSort(int[] array){
        int i = 0;
        while(i<array.length){
            // caculate the correct index for the element at i 
            int correctIndex = array[i]-1;
            if(array[i]!= array[correctIndex]){
                //swap them
                // either do this - 

                // int temp = array[i];
                // array[i] = array[correctIndex];
                // array[correctIndex] = temp;
                // or do this -

                swap(array, i, correctIndex);
            }
            else{i++;}
        }
    }
    static void swap(int[] array, int i, int correctIndex){
        int temp = array[i];
        array[i] = array[correctIndex];
        array[correctIndex] = temp; 
    }
}