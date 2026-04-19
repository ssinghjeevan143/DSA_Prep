class MyLinkedList {
    List<Integer> list = null;
    public MyLinkedList() {
         list = new ArrayList<>();
    }
    
    public int get(int index) {
        if (list.size() > index) {
            return list.get(index);
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        list.add(0, val);
    }
    
    public void addAtTail(int val) {
        list.add(val);
    }
    
    public void addAtIndex(int index, int val) {
       
        if (index == list.size()) {
            addAtTail(val);
        }
        else if (list.size() > index) {
            list.add(index, val);
        }
    }
    
    public void deleteAtIndex(int index) {
        if (list.size() != index && list.size() > index) {
            list.remove(index);
        }
            
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
//  class MyLinkedList {
//     // Node class
//     private class Node {
//         int val;
//         Node next;
//         Node(int val) {
//             this.val = val;
//         }
//     }

//     private Node head;   // starting node
//     private int size;    // track length of list

//     // Constructor
//     public MyLinkedList() {
//         head = null;
//         size = 0;
//     }

//     // Get value at index
//     public int get(int index) {
//         if (index < 0 || index >= size) return -1;
//         Node curr = head;
//         for (int i = 0; i < index; i++) {
//             curr = curr.next;
//         }
//         return curr.val;
//     }

//     // Add at head
//     public void addAtHead(int val) {
//         Node newNode = new Node(val);
//         newNode.next = head;
//         head = newNode;
//         size++;
//     }

//     // Add at tail
//     public void addAtTail(int val) {
//         Node newNode = new Node(val);
//         if (head == null) {
//             head = newNode;
//         } else {
//             Node curr = head;
//             while (curr.next != null) {
//                 curr = curr.next;
//             }
//             curr.next = newNode;
//         }
//         size++;
//     }

//     // Add at index
//     public void addAtIndex(int index, int val) {
//         if (index < 0 || index > size) return;
//         if (index == 0) {
//             addAtHead(val);
//             return;
//         }
//         if (index == size) {
//             addAtTail(val);
//             return;
//         }

//         Node newNode = new Node(val);
//         Node curr = head;
//         for (int i = 0; i < index - 1; i++) {
//             curr = curr.next;
//         }
//         newNode.next = curr.next;
//         curr.next = newNode;
//         size++;
//     }

//     // Delete at index
//     public void deleteAtIndex(int index) {
//         if (index < 0 || index >= size) return;
//         if (index == 0) {
//             head = head.next;
//         } else {
//             Node curr = head;
//             for (int i = 0; i < index - 1; i++) {
//                 curr = curr.next;
//             }
//             curr.next = curr.next.next;
//         }
//         size--;
//     }
// }