import java.util.Arrays;

public class A14_insertionSortWithoutRecursion {
    public static void main(String[] args) {
        int[] array = {5,0,2,4,3,1};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void insertionSort(int[] array){
        for(int i =0;i<=array.length-2;i++){
            for(int j =i+1;j>0;j--){
                if(array[j-1]>array[j]){
                    swap(array,j-1,j);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
