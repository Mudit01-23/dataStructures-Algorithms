package questions;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        
        // list.insertInFirstPosition(5);
        // list.insertInFirstPosition(4);
        // list.insertInFirstPosition(3);
        // list.insertInFirstPosition(2);
        // list.insertInFirstPosition(1);
        
    // list.printLinkedList();
   
    // list.deleteNode(1);
    // list.printLinkedList();
//         LL list1 = new LL();
//    list1.insertRec(1, 0);
//    list1.insertRec(1, 1);
//    list1.insertRec(2, 2);
//    list1.insertRec(2, 3);
//    list1.insertRec(3, 4);
  

//       LL list2 = new LL();
//    list2.insertRec(1, 0);
//    list2.insertRec(2, 1);
//    list2.insertRec(3, 2);
//    list2.insertRec(4, 3);
//    list2.insertRec(5, 4);

//         list1.printLinkedList();
//         list2.printLinkedList();



//         LL list1 = new LL();
//    list1.insertRec(1, 0);
//    list1.insertRec(1, 1);
//    list1.insertRec(2, 2);
//    list1.insertRec(2, 3);
//    list1.insertRec(3, 4);
  

      LL list2 = new LL();
   list2.insertRec(1, 0);
   list2.insertRec(2, 1);
   list2.insertRec(3, 2);
   list2.insertRec(4, 3);
   list2.insertRec(5, 4);
  
   //list2.insertRec(4, 3);
//   list2.insertRec(5, 4);
   
// list2.printLinkedList();
//    System.out.println(list2.returnMiddle(list2));

//   list2.printLinkedList();
// System.out.println(list2.midUsingFastAndSlow(list2));
    
    list2.printLinkedList();
    list2.rotateRight(list2, 2);
    list2.printLinkedList();


    

    }
}
