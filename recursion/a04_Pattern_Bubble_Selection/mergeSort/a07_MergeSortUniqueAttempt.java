import java.util.Arrays;

public class a07_MergeSortUniqueAttempt {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};

        int[] arr3 = new int[arr1.length+arr2.length];
        fxn(arr1,arr2,arr3);
        System.out.println(Arrays.toString(arr3));

    }

// my attempt

    // static void fxn(int[] arr1,int[] arr2,int[] arr3){
    //     int arr1Pointer = 0;
    //     int arr2Pointer = 0;

    //     for(int i=0;i<arr3.length-1;i++){
    //         if(arr1[arr1Pointer]>arr2[arr2Pointer]){
    //             if(arr1Pointer>3){
    //                 break;
    //             }
    //             arr3[i] = arr1[arr1Pointer];
    //             arr1Pointer++;
               
    //         }

    //         else{
    //             if(arr2Pointer>3){
    //                 break;
    //             }
    //             arr3[i] = arr2[arr2Pointer];
    //             arr2Pointer++;
    //         }
    //     }

    // }

    static void fxn(int[] arr1, int[] arr2, int[] arr3) {
        int arr1Pointer = 0, arr2Pointer = 0, i = 0;
    
        while (arr1Pointer < arr1.length && arr2Pointer < arr2.length) {

            if (arr1[arr1Pointer] < arr2[arr2Pointer]) {  // Ensure ascending order
                arr3[i++] = arr1[arr1Pointer++];
            } else {
                arr3[i++] = arr2[arr2Pointer++];
            }
        }
    
        // Copy remaining elements from arr1 (if any)
        while (arr1Pointer < arr1.length) {
            arr3[i++] = arr1[arr1Pointer++];
        }
    
        // Copy remaining elements from arr2 (if any)
        while (arr2Pointer < arr2.length) {
            arr3[i++] = arr2[arr2Pointer++];
        }
    }
    
}
