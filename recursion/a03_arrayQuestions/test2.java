package a03_arrayQuestions;
import java.util.ArrayList;
public class test2{
    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>();
        int[] array = {1,1,1,2,3,3,3,5,5,6,6,6};
        int target= 1;
        ArrayList<Integer> answer = allIndex(new ArrayList<>() ,array,0,target);
        System.out.println(answer);

    }

    static ArrayList<Integer> allIndex(ArrayList<Integer> list,int[] array,int index,int target ){
        if(index== array.length){
            return list;
        }
        if(array[index]==target){
            list.add(index);
        }
        return allIndex(list, array, index+1, target);
    }
}