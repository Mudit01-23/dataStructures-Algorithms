import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] array = {5,3,2,1,0,4};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    static void quickSort(int[] array, int low,int high){
        if(low>=high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start+ (end-start)/2;
        int pivot = array[mid];
        while(start<=end){

            while(array[start]<pivot){
                start++;
            }
            while(array[end]>pivot){
                end--;
            }

            if(start<=end){

                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }

            quickSort(array, low, end);
            quickSort(array, start, high); 
        }
    
    }
}
