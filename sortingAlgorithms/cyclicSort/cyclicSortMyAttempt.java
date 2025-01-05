package cyclicSort;

import java.util.Arrays;

public class cyclicSortMyAttempt {
    public static void main(String[] args) {
        //int[] array = {4,3,5,1,2};
        int[] array = {3,5,2,1,4};
        //int[] array = {4,3,5,1,2,0};

        System.out.println(Arrays.toString(array));
        cyclicSort(array);
        System.out.println(Arrays.toString(array));
    }
    
    static void cyclicSort(int[] array){

        for (int i = 0; i < array.length; i++) {
            int ElementInThisIndex = i+1;

            while(array[i] != ElementInThisIndex){
                int correctIndex = array[i]-1;
                swap(array,i,correctIndex);
            }
        }
    }

    static void swap(int[] array, int firstElementIndex, int secondElementIndex){
        int temp = array[firstElementIndex];
        array[firstElementIndex] = array[secondElementIndex];
        array[secondElementIndex] = temp;
    }
    
}



