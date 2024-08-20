package Step06_LinkedList.Prep01_Learn1DLinkedList;

public class P05_SearchLL {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        while(head != null){
            if(head.data == key) return true;
            head = head.next;
        }
        return false;
    }

    private static class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }

}
