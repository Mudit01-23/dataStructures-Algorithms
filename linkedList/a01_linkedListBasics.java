import java.util.LinkedList;
public class a01_linkedListBasics {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.addLast(34);
        list.addFirst(0);

        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i) + " -> ");
        }

        System.out.println("null");


        System.out.println("***");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    
    }
}
