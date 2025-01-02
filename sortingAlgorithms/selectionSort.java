import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] array= {4,3,1,5,0,6};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }    

    static void selectionSort(int[] array){
        boolean swap = true;
        for (int i = 0; i < array.length; i++) {
            swap = false;
            int maximumElementIndex = 0;
            for (int j = 0; j < array.length-i; j++) {

                if(array[j]>array[maximumElementIndex]){
                    maximumElementIndex = j;
                    }
                
                 }
            // swap the last element of the array with the element of maximumElementIndex
                // array[maximumElementIndex] <-> array[array.length-i];    
                int temp = array[maximumElementIndex];
                array[maximumElementIndex] = array[array.length-1-i];
                array[array.length-1-i] = temp;
                swap = true;



            if(swap == false){
                break;
            }
        }
    }
}
