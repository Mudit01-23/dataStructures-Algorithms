package a07_BacktrackingAndMaze;
    // here is the other method to do the same maze with obstacles question

import java.util.ArrayList;
import java.util.List;

public class a03_mazeWithObstaclesPart2 {
    public static void main(String[] args) {
        
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        List<String> ans = fxn("",maze,0, 0); 
        System.out.println(ans);
    }

    static List<String> fxn(String p, boolean[][] maze, int row,int column){
        // what to do?
        // base case, add the edge condition and then, make the recursion calls

        if(row== maze.length-1 && column == maze[0].length-1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(maze[row][column]== false){
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();

        if(row<maze.length-1){
            ans.addAll(fxn(p+ 'D',maze, row+1,column));
        }

        if(column<maze[0].length-1){
            ans.addAll(fxn(p+'R',maze,row,column+1));
        }
        return ans;
    }
}
