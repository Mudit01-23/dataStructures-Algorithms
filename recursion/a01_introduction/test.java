import java.util.Arrays;

public class test{
    public static void main(String[] args) {
        int[][] array = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(Arrays.deepToString(array));
        int[][] reverseRows = reverseRows(array);
        int[][] invertImage = invertImage(reverseRows);
        System.out.println(Arrays.deepToString(invertImage));
    }
    static int[][] reverseRows(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int start = 0;
            int end = array[i].length - 1;

            while (start < end) {
                // Swap elements in the row
                int temp = array[i][start];
                array[i][start] = array[i][end];
                array[i][end] = temp;

                start++;
                end--;
            }
        }
        return array;
    }

    static int[][] invertImage(int[][] array){
        for(int i = 0;i<array.length;i++){
            for(int j =0;j<array[i].length;j++){
                array[i][j] = 1-array[i][j];
            }
        }
        return array;
    }
   
}