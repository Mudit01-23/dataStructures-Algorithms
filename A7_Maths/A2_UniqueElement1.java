
public class A2_UniqueElement1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 2, 3,2,1};
        System.out.println("Element that occurs once: " + findUnique(array));
    }

    static int findUnique(int[] array) {
      // XOR all the numbers
      int unique = 0;
      
      for(int i =0;i<array.length;i++){
        unique = unique^array[i];
      }

      return unique;
      
    }
}