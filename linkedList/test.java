import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] array = {5,4,3,2,1};
    System.out.println(Arrays.toString(array));

    mergeInPlace(array,0, array.length);
    System.out.println(Arrays.toString(array));

  }

  public static void mergeInPlace(int[] array, int start, int end){
    // give the base case;
    if(end-start==1){
        return;
    }
    // find the middle element
    int mid = start+ (end-start)/2;

    mergeInPlace(array, start, mid);
    mergeInPlace(array, mid, end);

    combineArray(array, start,mid,end);
  }

  public static void combineArray(int[] array, int start, int mid, int end){
    int[] combinedArray = new int[end-start];

    int i = start;
    int j = mid;
    int k = 0;

    while(i<mid && j <end){

    if(array[i]<array[j]){
        combinedArray[k++] = array[i++];
    }
    else{
        combinedArray[k++] = array[j++];
    }

    }

    while(i<mid){
        combinedArray[k++] = array[i++];
    }
    while(j<end){
        combinedArray[k++] = array[j++];
    }

    for(int l=0;l<combinedArray.length;l++){
        array[start+l] = combinedArray[l];
    }

  }
    

}
