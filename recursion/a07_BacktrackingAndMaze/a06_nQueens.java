package a07_BacktrackingAndMaze;

public class a06_nQueens {
    public static void main(String[] args) {
        int n = 2;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    static int queens(boolean[][] board, int row){
        if(row== board.length){
            printBoard(board);
            System.out.println();
            return 1;

        }

        // now we are placing the queen and checking for every row and column
        int count = 0;

        for(int column=0;column<board.length;column++){

            // check if queen is safe

            if(isSafe(board,row,column)){

                board[row][column] = true;
                count = count + queens(board,row+1);
                board[row][column] = false;
                
                }


        }
        return count;

    }

    static boolean isSafe(boolean[][] board,int row,int column){

        // for vertical

        for(int i =0;i<row;i++){
            if(board[i][column]){
                return false;
            }
        }

        // for diagonal left
        int maxLeft = Math.min(row,column);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][column-i]){
                return false;
            }
        }

         int maxRight = Math.min(row,board.length-column-1);

        for(int i=1;i<=maxRight;i++){
            if(board[row-i][column+i]){
                return false;
            }
        }

        return true;
    }


    static void printBoard(boolean[][] board){
        for(boolean[] row: board){
            for(boolean element : row){
                if(element== true){ 
                    System.out.print(" Q ");
                }
                else{
                    System.out.print(" X ");
                }
                
            }
            System.out.println();
        }
        
    }
    
}
