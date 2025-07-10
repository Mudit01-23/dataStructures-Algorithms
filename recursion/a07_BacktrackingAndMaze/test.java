package a07_BacktrackingAndMaze;

public class test {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println("No of ways"+ n+ " queens could be placed in "+ n+ "X" + n+ " board is:  "+nQueens(board,0));
    }

    static int nQueens(boolean[][] board, int row){
        // base case
        if(row==board.length){
            printBoard(board);
            System.out.println();
            return 1;

        }
        int count =0;

        for(int column = 0;column<board.length;column++){
            if(isSafe(board, row, column) == true){
                board[row][column]= true;
                count = count + nQueens(board,row+1);
                board[row][column]= false;
            }
        }


        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int column){
        // for vertical
        for(int i=0;i< row;i++){
            if(board[i][column] == true){
                return false; 
            }
        }

        // for left diagonal 
        int maxLeft = Math.min(row,column);

        for(int i=1;i<= maxLeft;i++){
            if(board[row-i][column-i]== true){
                return false;
            }
        }

        // for right diagonal 
        int maxRight = Math.min(row,board.length-column-1);
        for(int i =1;i<=maxRight;i++){
            if(board[row-i][column+i]== true){
                return false;
            }
        }

        return true;
    }

    static void printBoard(boolean[][] board){
        for(int row =0;row< board.length;row++){
            for(int element = 0;element<board[0].length;element++){
                if(board[row][element]== true){
                    System.out.print(" Q");
                }
                else{
                    System.out.print(" X");
                }
            }

            System.out.println();
        }
    }
}
