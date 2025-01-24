import java.util.Arrays;
import java.util.Scanner;
public class A11_MaxItem {
    public static void main(String[] args) {
        int[] array = {3,5,1,6,7,2};
        // int maxElement = getMax(array);
        // System.out.println(maxElement);
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the first and last range");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int maxElementInRange = getMaxInRange(array,i, j);
        System.out.println(maxElementInRange);
    }
    static int getMax(int[] array){
        int maxElementIndex= 0;
        for(int i =0;i<array.length;i++){
            if(array[i]>array[maxElementIndex]){
                maxElementIndex = i;
            }
        }
        return array[maxElementIndex];
    }


    static int getMaxInRange(int[] array,int p,int q){
        int maxElementIndex= 0;
        for(int i = p;i<=q;i++){
            if(array[i]>array[maxElementIndex]){
                maxElementIndex = i;
            }
        }
        return array[maxElementIndex];
    }
}
