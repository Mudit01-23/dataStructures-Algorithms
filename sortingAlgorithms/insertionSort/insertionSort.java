package insertionSort;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void insertionSort(int[] array){
        for(int i =0;i<array.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }    
    
}