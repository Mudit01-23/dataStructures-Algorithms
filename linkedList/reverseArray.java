import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {
    
    int[] array = {5,4,3,2,1};
    System.out.println(Arrays.toString(array));
    int start = 0;
    int end = array.length-1;
    
    while(start<end){
        int temp = array[start];
        array[start] = array[end];
         array[end] = temp;
         start++;
         end--;
    }
    System.out.println(Arrays.toString(array));
    }
    
}
