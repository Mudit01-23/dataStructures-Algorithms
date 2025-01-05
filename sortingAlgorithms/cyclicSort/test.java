package cyclicSort;
import java.util.Arrays;
public class test{
    public static void main(String[] Args){
        //int[] array = {5,3,4,2,1};
        int[] array = {3,5,2,1,4};
        System.out.println(Arrays.toString(array));
        cyclicSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void cyclicSort(int[] array){
        int i = 0;
        while(i<array.length){
            // check for the correct index for the element at index i;
            int correctIndex = array[i]-1;
            if(array[i]!= array[correctIndex]){ // if the element at index i is not equal to array[correct index], then swap  
                swap(array,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] array, int i, int correctIndex){
        int temp = array[i];
        array[i] = array[correctIndex];
        array[correctIndex] = temp; 
    }
}