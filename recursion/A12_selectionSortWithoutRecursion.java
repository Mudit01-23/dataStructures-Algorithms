
import java.util.Arrays;
public class A12_selectionSortWithoutRecursion {
    public static void main(String[] args) {
        int[] array = {5,3,2,1,6,4};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void selectionSort(int[] array){
        for(int i =0;i<array.length;i++){
            int maxElementIndex = 0;
            for(int j = 0;j<array.length-i;j++){
                if(array[j]>array[maxElementIndex]){
                    maxElementIndex = j;
                }
                swap(array,j,maxElementIndex);
            }
        }
    }

    static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
