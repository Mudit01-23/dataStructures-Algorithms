import java.util.Scanner;

public class A6_binarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] array = {5,10,15,20,25,30};
        Scanner sc =new Scanner(System.in);
        int target = sc.nextInt();
       int answer = binarySearch(array,target,0,array.length-1);
        System.out.println(answer);
    }

    static int binarySearch(int[] array, int target,int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(target>array[mid]){
            return binarySearch(array, target, mid+1, end);
        }
        else if(target<array[mid]){
            return binarySearch(array, target, start, mid-1);
        }
        return mid;

    }
}
