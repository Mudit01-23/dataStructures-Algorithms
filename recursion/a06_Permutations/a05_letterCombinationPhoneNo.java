import java.util.List;
import java.util.ArrayList;
// this is the leetcode question 

public class a05_letterCombinationPhoneNo {
    public static void main(String[] args) {
        List<String> ans1 = letterCombinations("23");
        System.out.println(ans1); 
    }

    static String[] mapping = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();

        else{
            return pad("", digits);
        }
    }

    static List<String> pad(String p, String u) {
        if (u.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();
        int digit = u.charAt(0) - '0';
        String letters = mapping[digit];

        for (int i = 0; i < letters.length(); i++) {
            ans.addAll(pad(p + letters.charAt(i), u.substring(1)));
        }

        return ans;
    }
}
