
import java.util.Arrays;

public class A16_cyclicSortWithoutRecursion{
    public static void main(String[] args){
        //int[] array = {5,4,3,2,1};  
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        cyclicSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void cyclicSort(int[] array){
       int i =0;
       while(i<array.length){
        int correctIndex = array[i]-1;
        if(array[i]!= array[correctIndex]){
            swap(array,i,correctIndex);
        }
        else{
            i++;
        }
       }
    }

    static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}