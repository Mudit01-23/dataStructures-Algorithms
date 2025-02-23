import java.util.Arrays;


// public class A15_FlipppingAnImage{
//     public static void main(String[] args) {
//         int[][] array = {{1,1,0},{0,0,1},{1,0,0}};
//         System.out.println(Arrays.deepToString(array));
//         int[][] reverseArrays = reverseArrays(array);
//         int[][] invertedImage = invertImage(reverseArrays);
//         System.out.println(Arrays.deepToString(invertedImage));

//     }

//     static int[][] reverseArrays(int[][] array){
        
//         for(int i =0;i<array.length;i++){
//             int start = 0;
//             int end = array[i].length-1;

//             while(start<end){
//                 int temp  =array[i][start];
//                 array[i][start]= array[i][end];
//                 array[i][end] = temp;

//                 start++;
//                 end--;

//             }
//         }
//         return array;
//     }

//     static int[][] invertImage(int[][] array){

//         for(int i =0;i<array.length;i++){
//             for(int j=0;j<array[i].length;j++){
//                // array[i][j] = 1-array[i][j];// or we can do one more thing, we can XOR(^) with 1
//                array[i][j] = 1^ (array[i][j]);
//             }
//         }
//         return array;
//     }
// }


// The optimised method to do this question


public class A15_FlipppingAnImage{
    public static void main(String[] args) {
        int[][] array = {{1,1,0},{0,0,1},{1,0,0}};
        System.out.println(Arrays.deepToString(array));
        int[][] reverseArrays = reverseArrays(array);
        System.out.println(Arrays.deepToString(reverseArrays));
    }

    static int[][] reverseArrays(int[][] array){
        for(int[] row: array){
            for(int i =0;i<array[0].length+1/2;i++){
                int temp = row[i]^1;
                row[i] = row[array[0].length-i-1]^1;
                row[array[0].length-i-1] = temp;
            }
        }
        return array;
    }



// this is for flipping 1d array image

//     public static void main(String[] args) {
//         //int[][] array = {{1,1,0},{0,0,1},{1,0,0}};
//         int[] array = {0,1,0};
//         System.out.println(Arrays.toString(array));
//         //System.out.println(Arrays.deepToString(array));
//         int[] reverseArrays = reverseArrays(array);
//         System.out.println(Arrays.toString(reverseArrays));
//     }

// static int[] reverseArrays(int[] array){
//     for(int i =0;i<(array.length+1)/2;i++){
//         int temp =array[i]^1;
//         array[i] = array[array.length-1-i]^1;
//         array[array.length-1-i] = temp;
       
//     }
//     return array;
// }



}