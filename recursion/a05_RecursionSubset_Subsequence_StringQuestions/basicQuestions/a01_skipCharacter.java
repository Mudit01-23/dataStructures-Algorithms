

public class a01_skipCharacter {
    public static void main(String[] args) {
       

        String s = "aaeaaiaaaoaau";
        StringBuilder str = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)!= 'a'){
                str.append(s.charAt(i));
            }
        }
        System.out.println(str);


    }
}



 //String str = "aaeaaiaaaoaau";


        // String answer = "";

        // for(int i =0;i<str.length();i++){
        //     if(str.charAt(i)!= 'a'){
        //         answer = answer+str.charAt(i);
        //     }
        // }
        // System.out.println(answer);