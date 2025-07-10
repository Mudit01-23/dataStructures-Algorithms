package circularLinkedList;

public class main {
    public static void main(String[] args) {
        circularSinglyLL list = new circularSinglyLL();
        list.insertingNodeInTheEnd(1);
        list.insertingNodeInTheEnd(2);
        list.insertingNodeInTheEnd(3);
        list.insertingNodeInTheEnd(4);

        list.displayLinkedList();
    }
}
