package a07_BacktrackingAndMaze;
        // a01_MazeSolutionsCount- this tell the number of ways to go from point a to b from (3,3) to (0,0)

public class a01_MazeSolutionsCount {
    public static void main(String[] args) {
        int ans = maze(3,3);
        System.out.println(ans);
    }
    static int maze(int row, int column){
        if(row==1 || column ==1){
            return 1;
        }
        
        int right = maze(row,column-1);
        int down =  maze(row-1,column);
        return right+down;

        
    }
}
