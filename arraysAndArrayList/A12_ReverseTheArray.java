
// import java.util.Arrays;

// public class A12_ReverseTheArray {
//     public static void main(String[] args) {
//         int[] array = {1,2,3,4,5};
//         System.out.println(Arrays.toString(array));
//         reverseArray(array);
//         System.out.println(Arrays.toString(array));
//                     // here we are returning the swapped array, other method could be where we directly swap the array without returning anything.
//     }
//     static int[] reverseArray(int[] array){
//        int i = 0;
//        int j = array.length-1;
//         while(i<=j){
//             swap(array,i,j);
//             i++;
//             j--;
//         }
          
//         return array;
//     }

//     static void swap(int[] array, int i,int j){
//         int temp = array[i];
//         array[i] = array[j];
//         array[j] = temp;
//     }
// }



import java.util.Arrays;

public class A12_ReverseTheArray {
    public static void main(String[] args) {
        int[] array = {1,2,5,9,7};
        System.out.println(Arrays.toString(array));
        reverseArray(array);
        System.out.println(Arrays.toString(array));
                    // here we directly reverse the array without returning the array for from function.
    }
    static void reverseArray(int[] array){
       int i = 0;
       int j = array.length-1;
        while(i<=j){
            swap(array,i,j);
            i++;
            j--;
        }
          

    }

    static void swap(int[] array, int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
