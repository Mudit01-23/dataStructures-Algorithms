
import java.util.HashMap;
public class test {
    
    public static void main(String[] args) {
        // Creating a HashMap to store characters and their frequencies
        HashMap<Character, Integer> map = new HashMap<>();

        String input = "hello";
        
        // Loop through each character in the string
        for (char c : input.toCharArray()) {

            // If character already exists in map, increment its count
            if (map.containsKey(c)) {
                
                map.put(c, map.get(c) + 1);  // Get current count and increment it
            } else {
                map.put(c, 1);  // If character is not in map, add it with count 1
            }
        }
        
        // Printing the frequency of each character
        System.out.println(map);  // Output: {h=1, e=1, l=2, o=1}
    }
}





