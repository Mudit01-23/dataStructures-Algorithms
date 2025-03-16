package a03_arrayQuestions;

public class a01_SortedOrNot {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,1};

        // without using recursion
     //   System.out.println(sortedOrNot(array));

        // by using recursion
        int start = 0;
        int end = array.length-1;
        //System.out.println(sortedOrNotUsingRecursion(array,start,end));


// by using second recursion method.
        System.out.println(sortedOrNotUsingRecursion2(array, 0));
    }


    // static boolean sortedOrNot(int[] array){
    //     boolean sorted = true;
    //    for(int i =1;i<array.length-1;i++){
    //     if(array[i+1]<array[i]){
    //         sorted = false;
    //     }
    //    }
    //     return sorted;
    // }

    static boolean sortedOrNotUsingRecursion(int[] array,int start, int end){
        
        if(start== array.length-1){
            return true;
        }
        if(array[start+1]<array[start]){
            return false;
        }

        return sortedOrNotUsingRecursion( array, start+1,end);


        
        
    }
    // this can be written in one more method -
    
    
    static boolean sortedOrNotUsingRecursion2(int[] array,int index){
        
        if(index== array.length-1){
            return true;
        }
       
        return array[index]<array[index+1] && sortedOrNotUsingRecursion2( array, index+1);


        
        
    }

}
