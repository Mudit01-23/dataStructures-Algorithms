// actual name of this file is a02_LL, renaming it as LL for simplicity

public class LL {

    private node head;
    private node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirstPosition(int value){
        node Node = new node(value);
        Node.next = head;
        head = Node;
        if(tail==null){
            tail = head;
        }
        size+=1;
    }

    public void printLinkedList(){

        node current = head;

        while(current != null){
            System.out.print(current.value + "->");
            current = current.next;
        }
        System.out.println("END");
    }

    public void insertAtLastPosition(int value){
       node NewNode = new node(value);
       if(head == null){
        head = NewNode;
        tail = NewNode;
       }
       else{
        tail.next = NewNode;
        tail = NewNode;
        
       }
    size++;


       

    }

    public void printListSize(){
        System.out.println(size);
    }


    public void addNodeAtSpecificIndex(int position, int value){
        node Node = new node(value);

        node temp = head;
        
    }

    private class node {
        private int value;
        private node next;

        public node(int value) {
            this.value = value;
        }

        public node(int value, node next) {
            this.value = value;
            this.next = next;
        }
    }


}
