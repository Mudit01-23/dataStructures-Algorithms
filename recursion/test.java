import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        int[] array = {5,10,15,20,25,30};
        Scanner sc =new Scanner(System.in);
        int target = sc.nextInt();
        int answer = binarySearch(array,target);
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
