import java.util.Arrays;


public class test2{
    public static void main(String[] args) {
     
       int[] arr1 = {1,2,3,4};
       int[] arr2 = {5,6,7,8};
       int[] arr3 = new int[arr1.length+arr2.length];

       int k =0;
       for(int n: arr1){  arr3[k++] = n; }
       for(int n: arr2){  arr3[k++] = n; }
       int row = arr3.length-1;
       int column  =0;
       bubbleSort(arr3,row,column);
       System.out.println(Arrays.toString(arr3));

    }

    static void bubbleSort(int[] arr,int row, int column){
        if(row==0){
            return;
        }
        
        if(column<row){
            
            if(arr[column]>arr[column+1]){

                int temp = arr[column];
                arr[column] = arr[column+1];
                arr[column+1] = temp;
            }

            bubbleSort(arr, row, column+1);
        }

        else{
            bubbleSort(arr, row-1, column);
        }
    }

}