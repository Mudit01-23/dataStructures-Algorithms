package a03_arrayQuestions;

public class a02_LinearSearch {
    public static void main(String[] args) {
        int[] array = {1,4,5,6,8,9,15};
        int target = 15;
        System.out.println(linearSearch(array,0,target));



      // searching the element from the back instead of front
      
    // System.out.println(linearSearchFromReverse(array,array.length-1, target));
    }

    static int linearSearch(int[] array,int index,int target){
        if(index== array.length){
            return -1;
        }
        if(array[index]==target){
            return index;
        }


        return linearSearch(array, index+1, target);
    }


    // searching the element from the back instead of front

// static boolean linearSearchFromReverse(int[] array,int index, int target){
//    if(index== -1){
//     return false;
//    }
//    return array[index]== target || linearSearchFromReverse(array, index-1, target);

// }


}
