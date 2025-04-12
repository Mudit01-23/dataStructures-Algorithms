public class a02_removeDuplicateRecursion1{ // we are going to remove the a particular duplicate letter using recursion

    // this was written by me
    public static void main(String[] args){
        String s = "aabbabbdfa";
        int stringIndex = 0;
        String answer = "";
        String answerString = fxn(s,stringIndex,answer);
        System.out.println(answerString);

    }

    static String fxn(String s, int stringIndex, String answer){
        if(stringIndex == s.length()){
            return answer;
        }

        if(s.charAt(stringIndex)!= 'a'){
            answer = answer+s.charAt(stringIndex);
        }        

        return fxn(s, stringIndex+1, answer);

    }
}
