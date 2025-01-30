import java.util.Arrays;

public class A11_bubbleSortUsingRecrusion {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 3};
        System.out.println("Original Array: " + Arrays.toString(arr));
        bubbleSortUsingRecursion(arr, arr.length);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
    static void bubbleSortUsingRecursion(int[] array, int n) {
        // Base case: If the array has one element or no elements, it is already sorted.
        if (n == 1) {
            return;
        }

        // Perform one pass of bubble sort (push the largest element to the end).
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
            }
        }

        // Recursive call to sort the remaining unsorted portion.
        bubbleSortUsingRecursion(array, n - 1);
    }

    // Swap method to exchange elements in the array
    static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
