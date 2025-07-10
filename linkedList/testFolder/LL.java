package testFolder;

public class LL {
    private Node head;
    private Node tail;
    
    private int size;

    // few operations of linkedlist
    // 1- add a new node in linkedlist (considering it is empty)

    public void addNewNode(int value){
        Node newNode = new Node(value);
        if(head==null){
            head= newNode;
            tail = newNode;
        }

        else{
            // if the LL is not empty
            newNode.next = head;
            head = newNode;
            
        }
        size++;
    }


    // 2- add the node in the first position 
        public void insertNodeInFirstPosition(int value){
            Node node = new Node(value);
            node.next = head;
            head = node;
            size++;
        }

    // 3- add the node in the last position
    public void insertNodeInLastPosition(int value){
        Node node = new Node(value);
        if(tail== null){
            head = node;
            tail = node;
            
        }
        else{
            tail.next = node;
            tail = node;
        }
        size++;
    }


    // and what if we have to insert element in last index and we are given only head and not tail
    public void insertNodeInLastPositionUsingHead(int value){
        Node node = new Node(value);
        if(tail== null){
            head = node;
            tail = node;
            
        }
        else{
             Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }

        temp.next = node;
        tail = node;
        }
       

        size++;

    }

    // 4- add the node in a specific index


    public void insertNodeInSpecificIndex(int position, int value){
       // invalid position check - 

       if(position<0 || position >size){
        System.out.println("Invalid position");
        return;
       }

       // insert in the beginning - 
       if(position == 0){
        insertNodeInFirstPosition(value);
        return;
       }

       // insert in the end
       if(position == size){
        insertNodeInLastPosition(value);
        return;
       }

       // somewhere in the middle

       Node newNode = new Node(value);
       Node temp = head;

       for(int i=0;i<position-1;i++){
        temp = temp.next;
       }
       newNode.next = temp.next;
       temp.next = newNode;

       size++;
       

    }
    // 5- Print the size of linkedList


    public void printSize(){
        System.out.println(size);
    }
    // 6- Print the linkedList

    
    public void printLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+ "->");
            temp = temp.next;
        }
        System.out.println("END");
    }


    // 7- Delete a node
    public void deleteNode(int position){
        // if we have to delete the first node
        if(position ==0){
            head = head.next;
            if(head == null){
                tail = head;
            }
            size--;
            return;
        }

        // if we have to delete the last node
        if(position==size-1){

        if(size<=1){
            if(position ==0){
            head = head.next;
            if(head == null){
                tail = head;
            }
            size--;
            return;
        }
          Node temp  =head;
          while(temp.next.next!= null){
            temp = temp.next;
          }
          temp.next = null;
          tail = temp;
          size--;
          return;
        }

        // if we have to delete the node from the middle

        Node temp = head;
        for(int i =0;i<position-1;i++){
            temp  = temp.next;
        }
        temp.next = temp.next.next;
        size--;
        
    }
    }


    // 8- Printing the value at a particular node
    public void printValueAtParticularNode(int index){
        Node temp = head;
        for(int i =0;i<index;i++){
            temp = temp.next;
        }
        System.out.println(temp.value);
    }


    // what if we want to find an index of a value

    public void findValue(int value){

        Node temp  =head;
        int index = 0;
        while(temp!=null){
            if(temp.value== value){
                System.out.println(index);
                return;
            }
            temp  =temp.next;
            index = index+1;
            
        }

       System.out.println("No index found");
    }

    // 9- 
    
    // here i am just testing my skills 
    public void testInsertElement(int value,int position){
        // inserting at 1st position
        Node node = new Node(value);
        if(position==0){
            node.next = head;
            head = node;
            size++;
        }
        // inserting at last index
        else if(position== size){
            Node temp = head;
            while(temp.next != null){
                temp= temp.next;
            }
            temp.next= node;
            tail = node;
        }

        // inserting somewhere in the middle
        
        else{
            Node temp  = head;
            for(int i =0;i<position-1;i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
            return;
        }
    }

    // 
    // this is the node class
    class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
