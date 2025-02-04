public class A7_UniqueElement3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6,1,2,3,1,2,3};
        System.out.println("Unique element is: " + findUnique(array));
    }
// visit later
// if the elements in the array repeats 5 times, 6 times and there is 1 unique element, just change the  if (bitCount[i] % 3 != 0) 3 with the no. of times

static int findUnique(int[] array) {
    int[] bitCount = new int[32]; // Count 1s at each of the 32 bit positions

    // Count the number of 1s for each bit position
    for (int num : array) {
        for (int i = 0; i < 32; i++) {
            if ((num & (1 << i)) != 0) {
                bitCount[i]++;
            }
        }
    }

    // Reconstruct the unique number using modulo 3
    int result = 0;
    for (int i = 0; i < 32; i++) {
        if (bitCount[i] % 3 != 0) { // If count isn't a multiple of 3, set the bit
            result |= (1 << i);
        }
    }

    return result;
}
}
