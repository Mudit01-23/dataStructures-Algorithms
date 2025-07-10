import java.util.Arrays;

public class test{
    public static void main(String[] args) {
        // quicksort

        int[] array = {5,4,3,2,1};
        System.out.println(Arrays.toString(array));
       int[] sortedArray= mergeSort(array);
        System.out.println(Arrays.toString(sortedArray));

    }

    static int[] mergeSort(int[] array){
        int mid = array.length/2;
         int[] left = mergeSort(Arrays.copyOfRange(array,0,mid));
         int[] right = mergeSort(Arrays.copyOfRange(array,0,mid));

         return merge(left,right);
        
    }

    static int[] merge(int[] first,int[] second){
        int i = 0;
        int j =0;
        int k =0;
        int[] merge= new int[first.length+second.length];

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                merge[k]= first[i];
                i++;
            }
            else{
                merge[k] = second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            array[]
        }
    }
}