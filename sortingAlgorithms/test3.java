import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {
        int array[] = {5,4,3,2,1,0};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void selectionSort(int[] array){
        boolean swap = true;
        for (int i = 0; i < array.length; i++) {
            swap = false;
            int maxElementIndex = 0;
            for (int j = 0; j < array.length-i; j++) {
                if(array[j] > array[maxElementIndex] ){
                    maxElementIndex = j;
                }
            }

            // now swap array[maxElementIndex] <-> array[length-1-i]
            int temp = array[maxElementIndex];
            array[maxElementIndex] = array[array.length-1-i];
            array[array.length-1-i] = temp;
            swap = true;

            if(!swap){
                break;
            }
        }

    }

}