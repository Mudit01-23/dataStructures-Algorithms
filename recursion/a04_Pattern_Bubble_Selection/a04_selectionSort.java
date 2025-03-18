package a04_Pattern_Bubble_Selection;

import java.util.Arrays;

public class a04_selectionSort {
    public static void main(String[] args) {
        int[] array = {4,6,2,7,1};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void selectionSort(int[] array){

        for(int i =0;i<array.length;i++){

            int lastElementIndex = array.length-i-1;

            int maxElementIndex =0;

            for(int j =0;j<=lastElementIndex;j++){
                if(array[j]>array[maxElementIndex]){
                    maxElementIndex =j;
                }
            }

            int temp=array[lastElementIndex];
            array[lastElementIndex] = array[maxElementIndex];
            array[maxElementIndex] = temp;

            
        }

    }
        
          
            
            
   
}
