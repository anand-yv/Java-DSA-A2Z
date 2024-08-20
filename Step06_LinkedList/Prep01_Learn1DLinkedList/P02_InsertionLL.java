package Step06_LinkedList.Prep01_Learn1DLinkedList;

public class P02_InsertionLL {
    Node insertAtEnd(Node head, int x) {
        if(head == null){
            return new Node(x);
        }
        Node tempHead = head;
        while(tempHead.next != null){
            tempHead = tempHead.next;
        }
        tempHead.next = new Node(x);
        return head;
    }

    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
}
