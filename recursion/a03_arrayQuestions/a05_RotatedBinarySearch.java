package a03_arrayQuestions;

public class a05_RotatedBinarySearch {
public static void main(String[] args) {
    //int[] array = {6,7,8,9,10,1,2,3,4,5};
    //int[] array = {1,3};
    int[] array = {1};

    
    int target = 3;
    int index = rotatedBinarySearch(array,target);
    System.out.println("Position of " + target +": "+ index);
    

}    


// in this question, find the pivot, and then apply binary search

static int rotatedBinarySearch(int[] array,int target){
    int start =0;
    int end =0;
    int pivot = findPivot(array);

    if(pivot == -1){
        start = 0;
        end = array.length-1;
    }


    else if(array[pivot]==target){
        return pivot;
    }


    else if(array[0]>target){
        start =  pivot+1;
        end = array.length-1;
    }
    else{
        start = 0;
        end = pivot-1;
    }

    return binarySearch(array,start,end,target);
}

static int findPivot(int[] array){ 
   
    for(int i =0;i<array.length-1;i++){
        if(array[i]>array[i+1]){
            return i;
        }
    }
    return -1;
}


static int binarySearch(int[] array, int start, int end,int target){
    while(start<=end){
        int mid = start + (end-start)/2;

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

