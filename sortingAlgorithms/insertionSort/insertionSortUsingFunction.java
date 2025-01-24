package insertionSort;

import java.util.Arrays;
                // this program will work for duplicate items in the array as well.
public class insertionSortUsingFunction{  
    public static void main(String[] args) {
        //int[] array = {5, 4, 3, 2, 1};
        //int[] array = {5,5,4, 4, 3, 2, 1};
        int[] array = {1,2,3,4,5 };           
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    // the i loop tells which element of the array needs to be put in it's place, and inner loop j will run for that i'th element and will break only when the value of j>j-1, meaning the element is placed at it's correct place, or j will break when it reaches the condition         j>0 = false.

    static void insertionSort(int[] array){
       for (int i = 0; i < array.length-1; i++) {
        for (int j = i+1; j >0; j--) {              
            if(array[j]<array[j-1]){
                swap(array, j,j-1);
            }
            else{
                break;
            }
        }
       }
    }
    static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first]= array[second];
        array[second] = temp;
    }
}
