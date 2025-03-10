public class A9_linearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] array = {2,3,5,9,11};
        int target = 11;
        int answer = binarySearch(array,target,0);
        System.out.println(answer);
    }    
    static int binarySearch(int[] array, int target, int index){
       if(index == array.length){
        return -1;
       }
       else if(array[index]== target){
            return index;
       }
       return binarySearch(array, target, index+1);
    }
}

/*
 * there are 3 conditions- if we've crossed the index and didn't found the element then return -1, if we've found the element, then return the element, and third one - if we've not found the element and increase the index by 1.
 * 
 * so the arguements of the funtion will be array, target, start, index
 */