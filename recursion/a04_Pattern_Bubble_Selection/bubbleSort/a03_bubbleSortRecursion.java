package a04_Pattern_Bubble_Selection;

import java.util.Arrays;

public class a03_bubbleSortRecursion {
    public static void main(String[] args) {
        //int[] array = {4,3,2,1};
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        bubbleSort(array,array.length-1,0);
        System.out.println(Arrays.toString(array));

    }


    static void bubbleSort(int[] array,int row,int column){

        if(row==0){
            return;
        }

        if(column<row){

            if(array[column]>array[column+1]) // for arranging elements in decreasing order -
                                             // if(array[column]>array[column+1])
            {
                int temp= array[column];
                array[column] = array[column+1]; 
                array[column+1] = temp;

            }
            bubbleSort(array, row, column+1);
        }

        else{

            bubbleSort(array, row-1, 0);
        }


    }
}
