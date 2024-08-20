package Step06_LinkedList.Prep01_Learn1DLinkedList;

public class P04_LengthLL {

    public int getCount(Node head) {
        // code here
        int length = 0;
        while(head != null){
            length++;
            head = head.next;
        }
        return length;
    }


    private static class Node{
        int data;
        Node next;
        Node(int a){  data = a; next = null; }
    }
}
