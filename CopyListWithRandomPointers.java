import java.util.LinkedList;
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


class Solution {
    public static void main(String[] args) {
        createList();
        
    }

    public static Node createList() {
        Node head = new Node(7);
        Node t1 = new Node(13);
        Node t2 = new Node(11);
        Node t3 = new Node(10);
        Node t4 = new Node(1);
        head.next = t1;
        head.random = null;

        t1.next = t2;
        t1.random = head;

        t2.next = t3;
        

        t3.next = t4;
        t3.random = t2;

        t4.next = null;
        t4.random = t1;

        t2.random = t4;

        printList(head);
        System.out.println();
        copyRandomList(head);
        return head;
    }

    public static void printList(Node head) {
        Node ptr = head;
        while(ptr!=null) {
            System.out.print(ptr.val+","+ ptr.random+"->");
            ptr = ptr.next;
        }
    }

    public static Node copyRandomList(Node head) {
        if(head==null) {
            return null;
        }
        Node ptr = head;
        Node head2 =null;
        Node ptr2 = null;
        while(ptr != null) {
            Node temp = new Node(ptr.val);
            if(head2==null){
                ptr2 = temp;
                head2 = ptr2;
            } else {
                ptr2.next = temp;
                ptr2 = ptr2.next;
            }
            ptr = ptr.next;
        }

        Node ptr3 = head;
        Node ptr4 = head2;
        while(ptr3 != null) {
            ptr4.random = ptr3.random;
            ptr4 = ptr4.next;
            ptr3 = ptr3.next;
        }
        System.out.println();
        printList(head2);
        return head2;
    }
}