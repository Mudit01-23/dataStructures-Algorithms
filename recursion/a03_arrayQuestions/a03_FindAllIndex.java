package a03_arrayQuestions;

import java.util.ArrayList;

public class a03_FindAllIndex {
public static void main(String[] args) {
    int[] array = {1,1,1,3,3,3,3,3,4,5,5,6,6};

    

    int target = 6;

    // without using recursion


    ArrayList<Integer> list1 = allIndexWithoutRecursion(array, target);
    System.out.println(list1);



// using recursion
  
     int index = 0;
     
     ArrayList<Integer> list2 = new ArrayList<>();
     ArrayList<Integer> answer = allIndexUsingRecursion(array,target,index,list2);
     System.out.println(answer);
   


     // instead of passing the arraylist inside a function, we can make a static arraylist and then print that arraylist

    allIndexUsingRecursionPart2(array, target, index);
     System.out.println(staticList);
     
}


// without using recursion

static ArrayList<Integer> allIndexWithoutRecursion(int[] array,int target){
ArrayList<Integer> list= new ArrayList<>();
for(int i =0;i<array.length;i++){
    if(array[i]==target){
        list.add(i);
    }
}

return list;
}


// using recursion and passing arraylist inside the function

static ArrayList<Integer> allIndexUsingRecursion(int[] array,int target,int index,ArrayList<Integer> list){
   
    if(index==array.length){
        return list;
    }
    
    if(array[index] == target){
        list.add(index);
    }
    
    return allIndexUsingRecursion(array, target, index+1,list);
    }
    



    
    
    static ArrayList<Integer> staticList = new ArrayList<>();


    static void allIndexUsingRecursionPart2(int[] array,int target,int index){
        if(index==array.length){
            return;
        }
        if(array[index]== target){
            staticList.add(index);
        }
         allIndexUsingRecursionPart2(array, target, index+1);

    }
}

