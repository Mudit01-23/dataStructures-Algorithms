package circularLinkedList;

public class circularSinglyLL {
    private Node head;    
    private Node tail;
    private int size;

    public void insertingNodeInTheEnd(int value){
    Node node = new Node(value);
        if(head== null){
        head = node;
        tail = node;
        size++;        
        }
        
        tail.next=  node;
        node.next = head;
        tail = node;
        size++;
    }

    public void displayLinkedList(){
        Node node = head;

        while(node.next != head ){
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("END");
    }

    public Node getIndex(int value){
        Node node = head;
        while(node.next!= head){
            if(node.value == value){
                return node;
            }
        }
        return null;
    }

    public void deleteNode(int value){
        Node node = head;
        if(node==null){
            return;
        }

        // check for head
        if(node.value== value){
            tail.next = head.next;
            head = head.next;
        }

        Node temp = head.next;
        while(node!= head.next){

        }
        
        

    }
    
    private class Node{
    private int value;
    private Node next;

    public Node(int value){
        this.value = value;

    }

    }
}
