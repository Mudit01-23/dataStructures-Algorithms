public class a02_printStringUsingRecursionMyMethod { // removing duplicates using recursion
    public static void main(String[] args){
        String s = "aabcdaad";
        int stringIndex = 0;        // this is a my try to print the string using recursion 
     
        fxn(s,stringIndex);

    }



    static void fxn(String s, int stringIndex){
        if(stringIndex == s.length()){
            return;
        }
        System.out.print(s.charAt(stringIndex));
       fxn(s,stringIndex+1);
        
    }



}
