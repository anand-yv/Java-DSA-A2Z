package Step06_LinkedList.Prep02_LearnDoublyLinkedList;

public class P02_InsertionDLL {
    void addNode(Node head_ref, int pos, int data)
    {
        // Your code here
        while(head_ref != null && pos != 0){
            head_ref = head_ref.next;
            pos--;
        }
        if(head_ref == null) return;
        Node node = new Node(data);
        node.next = head_ref.next;
        node.prev = head_ref;
        head_ref.next = node;
    }

    private static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
