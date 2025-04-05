import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] array = {6,5,2,0,1,3,4};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void insertionSort(int[] array){
        
        for(int i=0;i<array.length;i++){
            
            int maxElementIndex= 0;

            for(int j =0;j<array.length;j++){

                if(array[j]>array[maxElementIndex]){

                    maxElementIndex= j;
                }
                int temp = array[j];
                array[j] = array[maxElementIndex];
                array[maxElementIndex] = temp;

            }
            
        }
    }
}
