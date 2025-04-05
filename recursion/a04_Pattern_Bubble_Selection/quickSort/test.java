import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        // implementing bubble sort
        int[] array = {5,3,4,2,0,1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    static void bubbleSort(int[] array){
        for(int i =0;i<array.length;i++){
            for(int j =0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("");
        
    }

}
}