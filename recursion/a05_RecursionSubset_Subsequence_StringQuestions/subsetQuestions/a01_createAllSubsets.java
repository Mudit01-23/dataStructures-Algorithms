import java.util.ArrayList;
public class a01_createAllSubsets { // print all subset of the string
    public static void main(String[] args) {
        String up = "abc"; // unprocessed string
        String p = ""; // processed string
        fxn(up,p);
       
    }

    static void fxn(String up,String p){
       if(up.isEmpty()){
        System.out.println(p);
        return;
       }
       char c = up.charAt(0);

        fxn(up.substring(1),p+c); // taking the char at 0
        fxn(up.substring(1),p); // not taking the char at 0
    }
}
