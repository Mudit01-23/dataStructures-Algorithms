package doublyLinkedList;

public class test {
    private Node head;
    private Node tail;
    private int size;

    public void printSize(){
        System.out.println(size);
    }
    // 1- insert the element in first position
    
    public void insertInFirstPosition(int value){
        Node node = new Node(value);
        if(head== null){
            node.next= head;
            node.previous = null;
            head = node;
            tail = node;
            
        }
        else{
            node.next = head;
            node.previous = null;
            head.previous = node;
            head = node;
        }
        size++;
    }


    // 2- insert the element in last position

    public void insertInLastIndex(int value){
        Node node = new Node(value);
        if(head== null){
            insertInFirstPosition(value);
            return;
        }
        else{
            tail.next = node;
            node.previous = tail;
            node.next = null;
            tail = node;
            size++;
        }
        
    }

    public void insertInTheMiddle(int index,int value){
        if(index==0){
            insertInFirstPosition(value);
            size++;
            return;
        }

        else if (index == size-1){
            insertInLastIndex(value);
            size++;
            return;
        }
        else{
            Node node= new Node(value);
            Node temp  = head;
           for(int i=0;i<index-1;i++){
            temp = temp.next;
           } 

           node.next = temp.next;
           temp.next.previous = node;
           node.previous = temp;
           temp.next = node;
           size++;
           return;
        }

    }

    public void printLinkedListReverse(){
        System.out.print("END");
        Node temp = tail;
        while(temp!=null){
            System.out.print("->" + temp.value);
            temp  = temp.previous;
        }
        System.out.println();
        
    }


    // print the linkedlist
    public void printLinkedList(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value+ "->");
            temp = temp.next;
        }
        System.out.println("END");

    }


    // insert An Element In Last Index Using Head Only
    public void insertInLastIndexUsingHead(int value){
        Node node = new Node(value);
        if(head == null){
            insertInFirstPosition(value);
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        node.previous = temp;
        temp.next = node;
        tail = node;
        node.next = null;
        size++;
        
    }


    // insert node after particular node
    public void insertNodeAfterParticularNode(int afterWhichNode, int nodeValue){
        Node temp = head;
        int index = 0;
        int mainIndex= -1;

        while(temp!=null){

            if(temp.value== afterWhichNode){
                mainIndex = index;
                break;

            }
            else{
                index = index+1;
                temp = temp.next;
            }
            
        }
        if(mainIndex== -1){
            System.out.println("Element not present in the linkedlist");
            return;
        }
        if(mainIndex== size-1){
            insertInLastIndex(nodeValue);
            return;
        }

        Node node = new Node(nodeValue);
        Node temp1 = head;
        for(int i=0;i<mainIndex;i++){
            temp1 = temp1.next;
        }
        node.next= temp.next;
        temp.next.previous = node;
        node.previous = temp;
        temp.next = node;
        size++;


    }


 // more appropriate method of inserting a node after particular index
  
    
    public void insertNodeAfterParticularNodeBetterMethod(int afterNode, int value ){
        Node referencePointer  = getPointer(afterNode);

        if(referencePointer== null){
            System.out.println(afterNode + " Element not present");
            return;
        }

        Node node = new Node(value);

        node.next = referencePointer.next;
        referencePointer.next = node;
        node.previous = referencePointer;

        if(referencePointer.next!= null){
            referencePointer.next.previous = node;
        }
        size++;
    }



    // to get the pointer
     public Node getPointer(int value){
            


            Node node = head;
            while(node!= null){
                if(node.value == value){
                    return node;
                }
                node = node.next;
            }
            return null;
        }



   private class Node{
   
     private int value;
    private Node next;
    private Node previous;
    

    public Node(int value){
        this.value = value;
    }

       



    public Node(int value, Node next, Node previous){

        this.value=  value;
        this.next = next; 
        this.previous = previous;

    }
   }
   
   }

