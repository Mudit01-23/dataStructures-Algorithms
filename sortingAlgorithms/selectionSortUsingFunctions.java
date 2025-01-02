import java.util.Arrays;

public class selectionSortUsingFunctions {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1,0};
        System.out.println(Arrays.toString(array));
        selectionSortUsingFunctions(array);
        System.out.println(Arrays.toString(array));
    }
    static void selectionSortUsingFunctions(int[] array){
        for (int i = 0; i < array.length; i++) {
            int lastElementIndex = array.length-1-i;

            int maxElementIndex = maxElementIndex(array, 0,lastElementIndex);
            
            swap(array,maxElementIndex,lastElementIndex);
        }
        
    }

    static int maxElementIndex(int[] array,int startElementIndex, int lastElementIndex){
        int maxElementIndex = startElementIndex;
        for (int i = startElementIndex; i <=lastElementIndex; i++) {
            if(array[i]>array[maxElementIndex]){
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }

    static void swap(int[] array,int first,int second){
        int temp = array[first];
        array[first]= array[second];
        array[second]= temp;
    }
}
