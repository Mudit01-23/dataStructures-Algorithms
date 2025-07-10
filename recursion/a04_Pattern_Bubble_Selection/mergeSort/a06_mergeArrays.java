//package a04_Pattern_Bubble_Selection;

import java.util.Arrays;

public class a06_mergeArrays{
    public static void main(String[] args) {
        int[] arr0 = {0,0,0};
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        
        int[] arr3 = new int[arr1.length+arr2.length+arr0.length];


        System.out.println(Arrays.toString(arr3));

        int k =0;

        for(int i=0;i<arr1.length;i++){
            arr3[k] = arr1[i];
            k++;
        }
        

        System.out.println(Arrays.toString(arr3));

        
        for(int i=0;i<arr2.length;i++){
            arr3[k] = arr2[i];
            k++;
        }

        System.out.println(Arrays.toString(arr3));

        for(int n : arr0){
            arr3[k] = n;
            k++;
            
        }
        System.out.println(Arrays.toString(arr3));

    }
}