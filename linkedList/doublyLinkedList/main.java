package doublyLinkedList;

public class main {
    public static void main(String[] args) {
        LL list = new LL();

        // list.insertElementInFirstPosition(4);
        // list.insertElementInFirstPosition(3);
        // list.insertElementInFirstPosition(2);
        // list.insertElementInFirstPosition(1);
        // list.insertInTheLastPosition(5);
        // list.insertInTheLastPosition(6);

        list.printLinkedList();
        list.insertNodeInTheMiddle(0, 0);
        list.insertNodeInTheMiddle(1, 1);
        list.insertNodeInTheMiddle(3, 2);
        list.insertNodeInTheMiddle(2, 2);
        

        list.printLinkedList();
    }
} 
