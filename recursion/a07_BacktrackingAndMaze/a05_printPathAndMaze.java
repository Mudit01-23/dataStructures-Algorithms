package a07_BacktrackingAndMaze;

import java.util.Arrays;


public class a05_printPathAndMaze {
    public static void main(String[] args) {
        boolean[][] array = {
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
       fxn(array,"",0,0,new int[array.length][array[0].length],1);
        
        

    }

    static void fxn(boolean[][] array, String p,int row, int column, int[][] numArray,int step){
        
        if(array[row][column]== false){
            return;
        }

        if(row== array.length-1 && column == array[0].length-1){
            // base condition

            numArray[row][column] = step;

           for(int[] i: numArray){
                System.out.println(Arrays.toString(i));
                
            }
            
            System.out.println(p);
            System.out.println();
            return;
        }
            
            
            array[row][column]= false;
         
            numArray[row][column] = step;
         
         // left
         if(column>0){
            fxn(array, p+ "L", row, column-1,numArray,step+1);
         }
         // right
         if(column<array[0].length-1){
            fxn(array, p+ "R", row, column+1,numArray,step+1);
         }

         // up
         if(row>0){
           fxn(array, p+ "U",row-1, column,numArray,step+1);
         }
         
         // down
         if(row<array.length-1){
            fxn(array, p+ "D",row+1, column,numArray,step+1);
         }

         if(row<array.length-1 && column <array[0].length-1){

            fxn(array,p+"d", row+1,column+1,numArray,step+1);
         }

         array[row][column]= true;
         numArray[row][column] = 0;
         return;
    }
}
