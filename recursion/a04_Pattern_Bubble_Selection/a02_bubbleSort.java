package a04_Pattern_Bubble_Selection;
import java.util.Arrays;

public class a02_bubbleSort {
    public static void main(String[] args) {
       // int[] array = {4,3,2,1};
       int[] array = {4,3,1,2,6,5};


        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void bubbleSort(int[] array){

      for(int i =0;i<array.length-1;i++){
        for(int j=0;j<array.length-i-1;j++){
            if(array[j]>array[j+1]){
                swap(array,j,j+1);
    
            }
        }
      }

       
    }

    static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j]; 
        array[j] = temp;
    }
}
