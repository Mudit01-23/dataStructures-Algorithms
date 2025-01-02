import java.util.Arrays;

public class test1 {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1,0};
        System.out.println(Arrays.toString(array));
        selectionSortUsingFunctions(array);
        System.out.println(Arrays.toString(array));
    }

    static void selectionSortUsingFunctions(int[] array){
        for (int i = 0; i <= array.length-1; i++) {
            int firstElementIndex = 0;
            int lastElementIndex = array.length-1-i;
            int maxElement= maxElement(array,firstElementIndex,lastElementIndex);
            swap(array,maxElement,lastElementIndex);

        }
    }
    
    static int maxElement(int[] array,int firstElementIndex,int lastElementIndex){
        int maxElement = firstElementIndex;
        for (int i = maxElement; i <= lastElementIndex; i++) {
            if(array[maxElement]<array[i]){
                maxElement= i;
            }
        }
        return maxElement;

    };
    
    static void swap(int[] array,int first,int second){

        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
