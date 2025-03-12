// package easy;

import java.util.Arrays;

public class a6_binarySearchUsingRecursion {
     public static void main(String[] args) {
        int[] array = {5,7,10,11,15};

        System.out.println(Arrays.toString(array));
        int findNum = 15;
        int start = 0;
        int end = array.length-1;
        int position = binarySearch(array, findNum,start,end);
        System.out.println(position);

    }

    static int binarySearch(int[] array, int num,int start,int end){
        int mid = start + (end-start)/2;
        if(start>end){
            return -1;
        }
        
        

        if(num<array[mid]){
            return binarySearch(array,num,start,mid-1);
        }

        else if(num>array[mid]){
            return binarySearch(array,num,mid+1,end);
        }
        
        return mid;
        

    }
}
