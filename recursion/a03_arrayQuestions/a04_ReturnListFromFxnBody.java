package a03_arrayQuestions;
import java.util.ArrayList;
public class a04_ReturnListFromFxnBody {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5};
        int target= 1;
        // ArrayList<Integer> answer = allIndex(array,0,target);
        // System.out.println(answer);


        // without using helper function 

        ArrayList<Integer> answer1 = allIndex1(array,0,target);
        System.out.println(answer1);

    }


    //*********//*********//*********//*********//*********//*********//*********//*********//*********//


    // here in this function we have to return the list but we can't take it in arguement

    // static ArrayList<Integer> allIndex(int[] array,int index,int target){
    //     ArrayList<Integer> list = new ArrayList<>();
    //      helperFunction(list,array,index,target);
    //     return list;
    // }

    // static void helperFunction(ArrayList<Integer> list,int[] array,int index,int target){
    //     if(index==array.length){
    //         return;
    //     }

    //     if(array[index]== target){
    //         list.add(index);
    //     }

    //     helperFunction(list, array, index+1, target); 
    // }

    // this above one is one method but it is taking help of a helper function, what if we don't want to use the helper function.


    //*********//*********//*********//*********//*********//*********//*********//*********

    static ArrayList<Integer> allIndex1(int[] array,int index,int target){
        ArrayList<Integer> list = new ArrayList<>();
        
        if(index== array.length){
            return list;
        }
        // this will contain answer from that function call only
        
        if(array[index]== target){
            list.add(index);
        }

        ArrayList<Integer> answerFromBelowCalls = allIndex1(array, index+1, target);
        list.addAll( answerFromBelowCalls);
        return list;


    }


}
