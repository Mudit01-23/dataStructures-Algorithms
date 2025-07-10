import java.util.HashMap;
import java.util.Scanner;

public class hashMapQuestion {

    public static void main(String[] args) {
        // Set up scanner to read input from the test case runner
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();  // Read the input string

        // Step 1: Check for empty input
        if (input.isEmpty()) {
            System.out.println("Invalid Input");
            return;
        }

        // Step 2: Count the frequencies of each character
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 3: Find the first non-repeating character
        char firstNonRepeating = '\0';  // Default to null char
        for (char c : input.toCharArray()) {
            if (freqMap.get(c) == 1) {
                firstNonRepeating = c;
                break;
            }
        }

        // Step 4: Find the most frequent character
        char mostFrequent = '\0';
        int maxFrequency = 0;
        for (char c : freqMap.keySet()) {
            if (freqMap.get(c) > maxFrequency) {
                maxFrequency = freqMap.get(c);
                mostFrequent = c;
            }
        }

        // Step 5: Handle all repeating characters
        if (firstNonRepeating == '\0') {  // No non-repeating character found
            System.out.print("None ");
            // Print the first repeating character with the highest frequency
            for (char c : input.toCharArray()) {
                if (freqMap.get(c) == maxFrequency) {
                    System.out.println(c);
                    break;
                }
            }
        } else {
            // Print the first non-repeating character
            System.out.print(firstNonRepeating + " ");
            // Print the most frequent character
            System.out.println(mostFrequent);
        }

        scanner.close();  // Close the scanner
    }
}
