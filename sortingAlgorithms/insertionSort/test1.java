package insertionSort;

import java.util.Arrays;

public class test1 {   // code will work for duplicate elements in the array as well
    public static void main(String[] args) {
        //int[] array = {5, 4, 3, 2, 1};
        int[] array = {5,5,4, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void insertionSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j >0; j--) {  // here j can't be j>=0, since if j>=0, then it will check for array[j-1] = array[-1] element for swapping which is arrayOutOfBound
             
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
