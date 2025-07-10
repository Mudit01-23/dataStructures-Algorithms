package a07_BacktrackingAndMaze;
import java.util.Arrays;

public class reverseStringArray {
    public static void main(String[] args) {

        String[] name = {"bob","fish","rhytm"};
        String[] ans = fxn(name);
        System.out.println(Arrays.toString(ans));
    }

    static String[] fxn(String[] array ){
        for(int i=0;i<array.length;i++){
            if(vowelOrNot(array[i])== true){
                array[i] = reverseString(array[i]);
            }
        }
        return array;
        
    }

    static boolean vowelOrNot(String name){

        for(int i =0;i<name.length();i++){
            if(name.charAt(i)=='a'||name.charAt(i)== 'e'||name.charAt(i)== 'i'||name.charAt(i)== 'o'||name.charAt(i)== 'u'||name.charAt(i)== 'A'||name.charAt(i)== 'E'||name.charAt(i)== 'I'||name.charAt(i)== 'O'|| name.charAt(i)=='U'){
                return true;
            }
        }
        return false;
    }

    static String reverseString(String s){
        String ans = "";
        for(int i =0;i<s.length();i++){
          ans = s.charAt(i)+ans;
        }
        
        return ans;
      }
}
