import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
        
        }
        static void selectionSort(int[] array){
            int maxElement = 0;
            for(int i =0;i<array.length;i++){
                if(array[i]>array[maxElement]){
                    maxElement =i;
                }
                swap(array,i,maxElement);
            }
        }
        static void swap(int[] array, int i,int j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
		

    }

