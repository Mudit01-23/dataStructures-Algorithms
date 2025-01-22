
import java.util.ArrayList;
public class A6_StringPerformance {
    public static void main(String[] args) {


        // Adding alphabets to the empty string
        // String str = "";
        // for (int i = 0; i < 26; i++) {
        //     //System.out.println((char)('a'+i));
        //     char ch = (char)('a'+i);
        //     str+=ch;
        // }

        // System.out.println(str);



        // Adding alphabets to the empty array

        
        // char[] arr = new char[26];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]= (char)('a'+i);
        // }
        // System.out.println(Arrays.toString(arr));


        // Adding alphabets to an empty arraylist

        // ArrayList<Character> list = new ArrayList<>();

        // for(int i = 0;i<26;i++){
        //     list.add((char)('a'+i));
        // }

        // System.out.println(list);


        // one more method to do the same

        ArrayList<Character> list = new ArrayList<>();

        for(int i = 'a';i<='z';i++){
            list.add((char)(i));
        }

        System.out.println(list);
    }
    
}
