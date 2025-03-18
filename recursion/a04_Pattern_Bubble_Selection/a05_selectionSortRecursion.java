// package a04_Pattern_Bubble_Selection;

// import java.util.Arrays;

// public class a05_selectionSortRecursion {
//     public static void main(String[] args) {
//         int[] array = {5,4,3,2,1,0};
//         System.out.println(Arrays.toString(array));
//         int maxElementIndex =0;
//         int row = array.length-1;
//         int column= 0;
//         sSort(array,maxElementIndex,row,column);
//         System.out.println(Arrays.toString(array));

//     }

//     static void sSort(int[] array,int maxElementIndex,int row, int column){
//         if(row==0){
//             return;
//         }


//         if(column<=row){
//             if(array[maxElementIndex]<array[column]){
//                 sSort(array, column, row, column+1);
//             }
//             else{
//                 sSort(array,maxElementIndex,row,column+1);
//             }
//         }

//         else{
//             int temp = array[maxElementIndex];
//             array[maxElementIndex] = array[row];
//             array[row] = temp;

//             sSort(array, 0, row-1, 0);
            
//         }
//     }
// }




// my try (Not an optimal recursive approach)- 



// import java.util.Arrays;

// public class a05_selectionSortRecursion{

//     // not pure recursive approach,it is hybrid between recursive and iterative approach. It was my try, not recommended

//     public static void main(String[] args) {
//         //int[] array = {4,6,2,7,1,3,5};
//         int[] array = {1,2,3,4,5,1,2,3,4,5};
//         System.out.println(Arrays.toString(array));
//         selectionSort(array,0,array.length-1);
//         System.out.println(Arrays.toString(array));
//     }


//     static void selectionSort(int[] array,int firstElementIndex,int lastElementIndex){
//         if(lastElementIndex==0){
//             return;
//         }

//         int maxElementIndex=firstElementIndex;
//         for(int i =0;i<=lastElementIndex;i++){
//             if(array[i]>array[maxElementIndex]){
//                 maxElementIndex = i;
//             }
//         }

//         int temp = array[maxElementIndex];
//         array[maxElementIndex] = array[lastElementIndex];
//         array[lastElementIndex] = temp;

//         selectionSort(array, firstElementIndex, lastElementIndex-1);


   
// }

// }


 