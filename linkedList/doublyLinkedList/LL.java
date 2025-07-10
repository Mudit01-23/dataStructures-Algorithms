package doublyLinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public void printLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+ "->");
            temp = temp.next;
        }
        System.out.println("END");

    }
    
    // insert the node in the first position

    public void insertElementInFirstPosition(int value){
        Node node = new Node(value);

        // if the linkedList is empty
        if(head == null){
            head = node;
            tail = node;
            node.previous = null;
            node.next = null;

        }

        else{
            node.next = head;
            node.previous = null;
            head.previous = node;
            head = node;
        }
        size++;
    }

    // insert the node in the last position

    public void insertInTheLastPosition(int value){
        Node node = new Node(value);
        if(tail == null){
            head = node;
            tail = node;
            head.next = null;
            tail.next = null;
            
        }

        else{
            Node temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next= node;
            node.previous = temp;
            tail = node;
            node.next = null;
        }
        size++;
    }

    // insert the node in the middle

    public void insertNodeInTheMiddle(int value, int index){
        if(index ==0){
            insertElementInFirstPosition(value);
            return;
        }

        if(index == size){
            insertInTheLastPosition(value);
            return;
        }

        Node node = new Node(value);
        Node temp = head;

        for(int i = 0;i<index-1;i++){
            temp = temp.next;
        }
        node.next = temp.next.next;
        node.previous = temp;
        temp.next = node;
        node.next.previous = node;
        size++;

    }

   class Node{

    private int value;
    private Node previous;
    private Node next;

    Node(int value){
        this.value = value;
    }


    Node(int value, Node previous, Node next){
        this.value = value;
        this.previous = previous;
        this.next=  next;
    }

   }
}
