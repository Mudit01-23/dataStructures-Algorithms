import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        int array[] = {5,4,3,2,1,0};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

// the major change in this code is that here we are not declaring the swap variable outside both for loop, instead we are declaring it inside the outer for loop, and the swap remains false throughout the outer for loop and we are checking it while swapping the elements, during that we check if the value of maxELementIndex is already equal to the last index, which means that the element is already in it's correct place and so we don't have to swap it, the loop moves forward and since the swap is false, the loop breaks.

    static void selectionSort(int[] array){
        
        
        for (int i = 0; i <= array.length-1; i++) {
            boolean swap = false;
            int maxElementIndex= 0;    

            for (int j = 0; j <= array.length-1-i; j++) {

                if(array[j]> array[maxElementIndex]){
                    maxElementIndex = j;
                }

                
            }

            if(maxElementIndex!= array.length -1-i){// here we 
                int temp = array[maxElementIndex];
                array[maxElementIndex] = array[array.length-1-i];
                array[array.length-1-i] = temp;
                swap = true;
            }

            if(!swap){
                break;
            }
        }
    }
}
