package a07_BacktrackingAndMaze;

import java.util.ArrayList;
import java.util.List;
// a02_mazeSolutionPrintPath

public class a02_mazeSolutionPrintPath {
    public static void main(String[] args) {
    // just printing the answers directly        
        maze("",3,3);

        // adding the answers in arraylist
        List<String>  ans = mazeArrayList("",3,3);
        System.out.println(ans);

        // here we can go diagonal as well- 
        // here d = diagonal D = down R = right
        List<String>  ansDiagonal = mazeArrayListDiagonal("",3,3);
        System.out.println(ansDiagonal);


    }
// directly printing the paths
    static  void maze(String p, int row, int column ){
        if(row ==1 && column ==1){
            System.out.println(p);
            return;
        }

        if (row > 1) {
            maze(p + "D", row - 1, column);
        }
        if (column > 1) {
            maze(p + "R", row, column - 1);
        }
    }

    // adding them in the arraylist and then returning the arraylist

    static  List<String> mazeArrayList(String p, int row, int column ){

       if(row==1 && column==1){
        List<String> ans = new ArrayList<>();
        ans.add(p);
        return ans;

       }

       List<String> list = new ArrayList<>();
       if(row>1){
        list.addAll(mazeArrayList(p+ "D", row-1, column));
       }
       if(column>1){
        list.addAll(mazeArrayList(p+ "R", row, column-1));
       }
       
       return list;

        }
// here we can move diagonal as well- 
        static  List<String> mazeArrayListDiagonal(String p, int row, int column ){

            if(row==1 && column==1){
             List<String> ans = new ArrayList<>();
             ans.add(p);
             return ans;
     
            }
     
            List<String> list = new ArrayList<>();
            if(row>1&& column>1){
                list.addAll(mazeArrayListDiagonal(p+'d', row-1, column-1));
            }
            if(row>1){
             list.addAll(mazeArrayListDiagonal(p+ "D", row-1, column));
            }
            if(column>1){
             list.addAll(mazeArrayListDiagonal(p+ "R", row, column-1));
            }
            
            return list;
     
             }
        
     }

