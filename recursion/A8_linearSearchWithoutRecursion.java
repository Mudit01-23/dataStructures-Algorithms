public class A8_linearSearchWithoutRecursion {
    public static void main(String[] args) {
        int[] array = {2,3,5,9,11};
        int n = 11;
        int answer = binarySearch(array,n);
        System.out.println(answer);
    }    
    static int binarySearch(int[] array, int target){
        for(int i =0;i<=array.length-1;i++){
            if(target == array[i]){
                return i;
            }
        }
        return -1;
    }
}
