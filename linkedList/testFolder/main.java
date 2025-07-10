package testFolder;

public class main {
    public static void main(String[] args) {
        // LL list = new LL();
        // list.addNewNode(1);
        // list.printSize();
        // list.insertNodeInFirstPosition(0);
        // list.printSize();

        // System.out.println("Printing linkedList");
        // list.printLinkedList();

        // System.out.println("Adding element in the last index");

        // list.insertNodeInLastPosition(69);
        // list.printLinkedList();

        // System.out.println("adding new node at 2nd index");
        // list.insertNodeInSpecificIndex(1, 420);

        // list.printLinkedList();
        // list.printSize();

        // System.out.println("using insertNodeInLastPositionUsingHead");
        // list.insertNodeInLastPositionUsingHead(8);
        // list.insertNodeInLastPositionUsingHead(100);
        // list.printLinkedList();
        // list.printSize();
        // System.out.println("Deleting a node");
        // list.printLinkedList();
        // list.deleteNode(1);
        // list.printLinkedList();

        // LL list = new LL();
        // list.addNewNode(1);
        // list.insertNodeInLastPosition(2);
        // list.insertNodeInLastPosition(3);

        // list.printLinkedList();

        // list.testInsertElement(0, 0);
        // list.printLinkedList();

        // list.testInsertElement(69, 1);
        // list.printLinkedList();

        // printing the value at a particular index

        // list.printValueAtParticularNode(0);
        // list.printValueAtParticularNode(1);
        // list.printValueAtParticularNode(2);

        // finding the value
        // list.findValue(6);


        LL list = new LL();
        list.insertNodeInFirstPosition(3);
        list.insertNodeInFirstPosition(1);
        list.insertNodeInFirstPosition(0);
        list.printLinkedList();

        list.insertNodeInSpecificIndex(2, 2);
        
        list.printLinkedList();

    }
}
