package questions;
public class LL{
    // here we are going to perform similar opeartion of linkedlist using recursion
    private Node head;
    private Node tail;
    private int size;

    public void insertInFirstPosition(int value){
        Node node = new Node(value);
        if(size==0){
            head = node;
            tail = node;
            
        }
        else{
            
            node.next = head;
            head = node;

        }
        size++;
    }

    public void insertInLastPosition(int value ){
        if(size==0){
            insertInFirstPosition(value);
            return;
        }

        Node node = new Node(value);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
        tail = node;
        size++;

    }

    // public void insertInTheMiddle(int value, int index){
    //     if(index>size || index<0){
    //         System.out.println("Invalid index");
    //         return;
    //     }
    //     head = insertInTheMiddle(value, index, head);
    // }

    // private Node insertInTheMiddle(int value, int index, Node node){
    //     if(index== 0){
    //         Node temp = new Node(value, node);
    //         size++;
    //         return temp;
    //     }
    //     node.next = insertInTheMiddle(value, index-1, node.next);
    //     return node;
    // }




    // here i am trying to insert an element using recursion

    // public void insertRec(int value, int index){
    //     if(index<0 || index>size){
    //         System.out.println("Invalid index");
    //         return;
    //     }

    //      head = insertRec( value,  index, head);
    // }


    // public Node insertRec(int value, int index, Node node){
    //     if(index==0){
    //         Node temp = new Node(value,node);
    //         size++;
    //         return temp;
    //     }

    //     node.next=  insertRec( value, index-1,node.next);
    //     return node;

    // }


 public void insertRec(int value, int index){

    if(index<0 || index>size){
        System.out.println("Invalid index");
        return;


    }

    head = insertRec(value, index, head);
 }

 private Node insertRec(int value, int index, Node node){
    if(index==0){
        Node temp = new Node(value, node);
        size++;
        return temp;
    }
    node.next = insertRec(value, index-1, node.next);
    return node;
 }



// to remove the duplicate elements

public void removeDuplicates(){
    Node node = head;
    while(node.next!=null){
        if(node.value == node.next.value){
            node.next = node.next.next;
            size--;

        }
        else{
            node = node.next;


        }
    }

    tail = node;
    tail.next = null;

}








    public int valueToIndex(int value){
        Node temp = head;
        int counter= 0;
        while(temp!=null){

            if(temp.value== value){
                return counter;
            }

            counter++;
            temp = temp.next;
        }
        return -1;
    }

    public Node getReferenceOfNode(int index){
       Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
       }
       return temp;
    }


    public void deleteNode(int value){
        

        if(size==0){
            System.out.println("List empty");
            return;
        }
         
        

        int index = valueToIndex(value);

        if(index==-1){
            System.out.println("Invalid index");
            return;
        }
        
        System.out.println("Deleting: "+ value+ " at index: "+ index );

        if(index==0){
            // delete the first node 
            head = head.next;
            if(head==null){
                tail=null;
            }
            size--;
        }

        // delete the last node 
        else if(index==size-1){
            
            Node temp = getReferenceOfNode(size-2);
            temp.next = null;
            tail= temp ;
            size--;
        }

        // delete the remaining node
        else{
            int currentNodeIndex= valueToIndex(value);
            Node temp = getReferenceOfNode(currentNodeIndex-1);
            temp.next = temp.next.next;
            size--;
        }


    }

    public void printLinkedList(){
        
        Node node = head;
        while(node!= null){
            System.out.print(node.value+ "->");
            node = node.next;
        }
        System.out.println("END");
    }

    public class Node{
        private int value;
        private Node next;

        
        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }


public static LL mergeLinkedList(LL list1, LL list2){
    LL ansList = new LL();
    
    Node f = list1.head;
    Node s= list2.head;


    while(f!= null && s!= null){
        if(f.value<=s.value){
            ansList.insertInLastPosition(f.value);
            f = f.next;
        }

        else{
            ansList.insertInLastPosition(s.value);
            s = s.next;
        }

    }

    while(f!= null){
        ansList.insertInLastPosition(f.value);
        f = f.next;
    }

    while(s!= null){
        ansList.insertInLastPosition(s.value);
        s = s.next;
    }

    return ansList;
}

public int returnMiddle(LL list) {
    Node temp = list.head;
    int counter = 0;

    // Count total nodes
    while (temp != null) {
        counter++;
        temp = temp.next;
    }

    // Get middle index
    counter = counter / 2;
    System.out.println("Middle index: " + counter);

    // Reset temp to head again
    temp = list.head;

    // Move temp to middle node
    for (int i = 0; i < counter; i++) {
        temp = temp.next;
    }

    return temp.value;
}



// to test the node counter;

public int nodeCounter(LL list){
    int counter = 0;
    while(head!=null){
        head = head.next;
        counter+=1;
    }
    return counter;
}


// calculating the middle of the element using fast and slow pointer method

public int midUsingFastAndSlow(LL list){
    Node fast = head;
    Node slow = head;

    while(fast!=null && fast.next!=null){
        fast = fast.next.next;
        slow = slow.next;

        
    }
    return slow.value;

}

public LL ascendingOrderList(LL list){
         Node temp = head;

        int counter = 0;
        while(temp!=null){
            temp = temp.next;
            counter +=1;
        }

        for(int i=0;i<counter-1;i++){
            for(int j=0;j<counter-1-i;j++){
                if(head.value >head.next.value){
                    int swap = head.value;
                    head.value = head.next.value;
                    head.next.value = swap;

                    head = head.next; 
                }
            }
        }

        return list;

        

}

// to rotate a linkedlist

public LL  rotateRight(LL list, int k) {
        while(k!=0){
           head =  rotateList(head);
            k = k-1;
        }
        return list;
    }

    public Node rotateList(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        head = temp;

        return head;
    }
    

   
}

