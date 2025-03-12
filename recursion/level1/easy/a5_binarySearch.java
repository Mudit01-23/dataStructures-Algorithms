// package easy;
import java.util.Arrays;
// binary search without recursion
public class a5_binarySearch {
    public static void main(String[] args) {
        int[] array = {5,7,10,11,15};

        System.out.println(Arrays.toString(array));
        int findNum = 7;
        int position = binarySearch(array, findNum);
        System.out.println(position);
    }
    static int binarySearch(int[] array, int num){
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = start+ (end-start)/2;

            if(num> array[mid]){
                start = mid+1;
            }
            else if(num<array[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        
        return -1;
    }
}
