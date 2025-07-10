package a07_BacktrackingAndMaze;

import java.util.ArrayList;
import java.util.List;

public class a03_mazeWithObstacles {
    // a03_mazeWithObstacles - here we can go right and down
    public static void main(String[] args) {
        
        
        List<String> ans = fxn("",0,0);
        System.out.println(ans);
    }


    static List<String> fxn(String p, int row, int column) {

    if (row == 1 && column == 1) {
        return new ArrayList<>(); // reached obstacle, stop
    }
    if (row == 2 && column == 2) {
        List<String> ans = new ArrayList<>();
        ans.add(p);
        return ans; // reached destination
    }

    List<String> list = new ArrayList<>();

    if (row < 2) {
        list.addAll(fxn(p + 'D', row + 1, column)); // move down
    }
    if (column < 2) {
        list.addAll(fxn(p + 'R', row, column + 1)); // move right
    }

    return list;
}




}
