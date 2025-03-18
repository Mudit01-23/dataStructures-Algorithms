package a04_Pattern_Bubble_Selection;

public class a01_printPattern {
    public static void main(String[] args) {
        
        // for(int row = 1;row<4;row++){

        //     for(int col = 4;col<1;col--){
        //         System.out.print("*");

        //     }
        // }
        int n =5;

      //  straightTriangle(n);


       // reverseTriangle(n);


        reverseTriangleRecursion(n);
        System.out.println();
        reverseTriangleRecursionPart2(5,0);
    }

    // static void straightTriangle(int n){

    //     for(int row=1;row<n;row++){

    //         for(int column =1;column<=row;column++ ){

    //             System.out.print("*"); // strain
    //         }
    //         System.out.println();
    //     }
    // }

    // static void reverseTriangle(int n){

    //     for(int row = n;row>=1;row--){
    //         for(int column =1;column<=row;column++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    static void reverseTriangleRecursion(int row){
        
        if(row<=0){
            return;
        }
        for(int i=1;i<=row;i++){
            System.out.print("*");
        }

        System.out.println();
        
        reverseTriangleRecursion(row-1);
    }

                                           //(     5   ,     0)
    static void reverseTriangleRecursionPart2(int row,int column){

        if(row==0){
            return;
        }

        if(column<row){
            System.out.print("*");
            reverseTriangleRecursionPart2(row,column+1);
        }


        else{
            System.out.println();
            reverseTriangleRecursionPart2( row-1,0);
        }
    }

}
