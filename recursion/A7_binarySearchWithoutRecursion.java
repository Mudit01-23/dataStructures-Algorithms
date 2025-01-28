

public class A7_binarySearchWithoutRecursion {
public static void main(String[] args) {
    int[] array = {2,3,5,9,11};
    int n = 2;
    int answer = binarySearch(array,n);
    System.out.println(answer);
}    
static int binarySearch(int[] array, int target){
    int start = 0;
    int end = array.length-1;
    while(start<=end){
        int mid= start + (end-start)/2;
        if(target>array[mid]){
            start = mid+1;            
        }
        else if(target<array[mid]){
            end = mid-1;
        }
        else{
           return mid;
        }
    }
    return -1;
}
        
        
    }

