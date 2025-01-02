import java.util.Arrays;
public class test1 {
    public static void main(String[] args) {
        int[] array = {4,3,5,2,1,0};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    
    static void selectionSort(int[] array){
        boolean swap = true;

        for (int i = 0; i < array.length; i++) {
            int maxElementIndex = 0;
            swap = false;

            for (int j = 0; j < array.length-i; j++) {

                if(array[j] >array[maxElementIndex]){
                    maxElementIndex = j;
                }
            }


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
