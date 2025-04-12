public class a03_removeDuplicateRecursion2{ // 2 methods to remove a particular character from array
    // 1st one - pass the answer string in the function, 2nd one - without passing the answer string in the 
    // function.

    /* 
    public static void main(String[] args){
        String up = "aabakbaaba"; // unprocessed string
        String p = "";  // processed string

        String ans = fxn(up,p);
        System.out.println(ans);
    }
    static String fxn(String up,String p){
     if(up.isEmpty()){
        return p;
     }

     if(up.charAt(0)== 'a'){
       return fxn(up.substring(1),p);
     }

     return fxn(up.substring(1),p+up.charAt(0));

    }
    */

    public static void main(String[] args){ // one more method, here instead of passing the processed 
        // string variable, we could only pass the single string


        String s = "aabakbaaba"; 
       

        String ans = fxn(s);
        System.out.println(ans);
    }

    static String fxn(String s){
     if(s.isEmpty()){
        return "";
     }
     char c = s.charAt(0);

     if(c== 'a'){
       return fxn(s.substring(1));
     }

     return c+ fxn(s.substring(1));

    }

}
