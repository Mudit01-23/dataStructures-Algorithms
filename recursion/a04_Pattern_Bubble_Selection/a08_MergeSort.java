import java.util.*;

public class a08_MergeSort {
    
public static void main(String[] args) {
    int[] arr1 = {10,9,8,7,6,5,4,3,2,1,0};
    

    int[] arr2 = mergeSort(arr1);
    System.out.println(Arrays.toString(arr2));

}

static int[] mergeSort(int[] array){
    if(array.length==1){
        return array;
    }

    int mid = array.length/2;

    int[] left=mergeSort( Arrays.copyOfRange(array, 0, mid));
    int[] right= mergeSort(Arrays.copyOfRange(array,mid,array.length));

    return merge(left,right);

}

static int[] merge(int[] first,int[] second){
    int i=0;
    int j=0;
    int k=0;

    int[] merged = new int[first.length+second.length];


    while(i< first.length && j<second.length){
        if(first[i]<second[j]){
            merged[k]= first[i];
            i++;
        }
        else{
            merged[k] = second[j];
            j++;
        }

        k++;
    }

    while(i<first.length){
        merged[k]= first[i];
        i++;
        k++;
    }


    while(j<second.length){
        merged[k]= second[j];
        j++;
        k++;
    }

    return merged;
}
}
