import java.util.Scanner;
// asking for user's input in multi-dimensional array.

public class A3_2DArrays {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                //  System.out.print( "["+i+"]"+"["+j+"]"+" element: ");
                array[i][j] = sc.nextInt();
            }
        }


        // 5 ways of printing- 

        //System.out.println(Arrays.deepToString(array));
        
        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(Arrays.toString(array[i]));
        // }

        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0; j < array[i].length; j++) {
        //         System.out.print(array[i][j]+ " ");
        //     }

        //     System.out.println("");
        // }


        // for(int[] i:array){
        //         System.out.println(Arrays.toString(i));
        //     }


        for(int[] i:array){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
            
        }
    }

