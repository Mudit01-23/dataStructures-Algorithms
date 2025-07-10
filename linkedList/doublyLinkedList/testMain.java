package doublyLinkedList;

public class testMain {
    public static void main(String args[]){
        test ll = new test();
        ll.printSize();
        ll.insertInFirstPosition(4);
        ll.insertInFirstPosition(3);
        ll.insertInFirstPosition(2);
        ll.insertInFirstPosition(1);
        ll.printLinkedList();
        ll.printSize();

        ll.insertInLastIndex(5);
        ll.insertInLastIndex(6);
        ll.insertInLastIndex(7);
        ll.insertInLastIndex(8);

        ll.printLinkedList();
        ll.printSize();

    //     ll.insertInTheMiddle(1, 6);
        
    // ll.printLinkedList();
    // ll.insertInTheMiddle(7, 69);
    // ll.printLinkedList();

        ll.insertInLastIndexUsingHead(420);
        ll.printLinkedList();

        // ll.insertNodeAfterParticularNode(420,69);
        // ll.printLinkedList(); 

       

    

        ll.insertNodeAfterParticularNode(0,69);
        ll.printLinkedList();

        // working with pointers

        ll.insertNodeAfterParticularNodeBetterMethod(420, 70);
        ll.printLinkedList();
    }
}
