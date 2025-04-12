public class a04_skipString {
    // in this question we have to skip a particular string

    // method 1-


    // public static void main(String[] args) {
    //     String s = "bcdapplebcd";
    //     String ans = fxn(s,"");
    //     System.out.println(ans);


    // }

    // static String fxn(String up,String p){
    //     if(up.isEmpty()){
    //         return p;
    //     }
    //     if(up.startsWith("apple")){
    //         return fxn(up.substring(5),p);
    //     }

    //     return fxn(up.substring(1),p+ up.charAt(0) );
    // }



    // // method 2- 

    public static void main(String[] args) {
        String s = "bcdapplebcd";
        String ans = fxn(s);
        System.out.println(ans);


    }

    static String fxn(String s){
      if(s.isEmpty()){
        return "";
      }

      if(s.startsWith("apple")){
        return fxn(s.substring(5));
      }
      char c = s.charAt(0);
      return c+ fxn(s.substring(1));
      

    }


}
