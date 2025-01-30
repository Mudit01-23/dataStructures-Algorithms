import java.util.Arrays;
public class A10_bubbleSortWithoutRecrusion {
    public static void main(String[] args) {
        int[] arr = {2,5,1,4,3};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
// method no. 1
    static void bubbleSort(int[] array){
        for(int i = 0;i<array.length;i++){
            for(int j =1;j<array.length-i;j++){
                if(array[j-1]>array[j]){
                    swap(array,j-1,j);
                }
            }
        }
    }

    // method no 2
    
    // static void bubbleSort(int[] array){
    //     for(int i = 0;i<array.length;i++){
    //         for(int j =0;j<array.length-i;j++){
    //             if(array[j]>array[j+1]){
    //                 swap(array,j,j+1);
    //             }
    //         }
    //     }
    // }

    static void swap(int[] array,int a,int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
