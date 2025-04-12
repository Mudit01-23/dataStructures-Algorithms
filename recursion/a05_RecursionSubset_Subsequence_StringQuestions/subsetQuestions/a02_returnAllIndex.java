import java.util.ArrayList;

public class a02_returnAllIndex {

    public static void main(String[] args) {
        int[] array = { 4, 3, 5, 2, 1, 65, 1, 1, 1, 1, 1 };
        int target = 1;
        ArrayList<Integer> ans = fxn(array, target, 0);
        System.out.println(ans);
    }

    static ArrayList<Integer> fxn(int[] array, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == array.length) {
            return list; // base condition
        }

        if (array[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = fxn(array, target, index + 1);

        // Combine the list received from recursive calls with the local list
        // This merges all matching indices into a single list
        list.addAll(ansFromBelowCalls);

        return list;
    }

}
