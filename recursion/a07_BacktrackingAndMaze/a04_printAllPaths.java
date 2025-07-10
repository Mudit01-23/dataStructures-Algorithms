package a07_BacktrackingAndMaze;

import java.util.ArrayList;
import java.util.List;
// a04_printAllPaths.java - this will print all paths to reach the end element
public class a04_printAllPaths{
    public static void main(String[] args) {
        
        boolean[][] array = {
            {true,true,true},
            {true,true,true}, 
            {true,true,true},
        };

        List<String> ans = printPaths("",0,0,array);
        System.out.println(ans);
    }

    static List<String>  printPaths(String p,int row, int column,boolean[][] array){

        

        if(row ==array.length-1 && column==array[0].length-1){

            List<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }


        
        List<String> list = new ArrayList<>();  
        
        if(row>=array.length || column>=array[0].length || array[row][column]== false){
            return new ArrayList<>();
        }

        array[row][column]= false;


        if(column+1<array[0].length){
            list.addAll(printPaths(p+ 'R',row,column+1,array));// right
        }

        if(row+1<array.length){
            list.addAll(printPaths(p+ 'D',row+1,column,array));// down
        }
        // left
        if(column>0){
            list.addAll(printPaths(p+ 'L',row,column-1,array));// left
        }

        // up
        if(row>0){
            list.addAll(printPaths(p+ 'U', row-1, column,array));
        }
        // diagonal 
        if(row<array.length-1 && column< array[0].length-1){
            list.addAll(printPaths(p+ 'd', row+1, column+1,array));
        }   

        
        array[row][column]= true;
        return list;
    }
}