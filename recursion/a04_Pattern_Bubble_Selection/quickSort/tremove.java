import java.util.Arrays;
public class tremove {
    public static void main(String[] args) {
        int[] array = {1, 3, 2};
        int pivot = 1;
        fxn(array, pivot);
        System.out.println(Arrays.toString(array));
    }

    static void fxn(int[] array, int pivot) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            while (start <= end && array[start] < pivot) {
                start++;
            }
            while (start <= end && array[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
    }
}