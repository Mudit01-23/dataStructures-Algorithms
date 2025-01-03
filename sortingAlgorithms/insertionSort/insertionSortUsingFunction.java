package insertionSort;

import java.util.Arrays;
                // this program will work for duplicate items in the array as well.
public class insertionSortUsingFunction{  
    public static void main(String[] args) {
        //int[] array = {5, 4, 3, 2, 1};
        int[] array = {5,5,4, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

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
