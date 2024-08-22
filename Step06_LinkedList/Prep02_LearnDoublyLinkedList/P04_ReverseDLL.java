package Step06_LinkedList.Prep02_LearnDoublyLinkedList;
import Step06_LinkedList.Prep02_LearnDoublyLinkedList.P03_DeletionDLL.Node;

public class P04_ReverseDLL {
    public Node reverseDLL(Node head){
        if(head == null) return null;

        Node prev = null;
        Node pres = head;
        while(pres != null){
            Node next = pres.next;
            pres.next = prev;
            pres.prev = next;
            prev = pres;
            pres = next;
        }
        return prev;
    }
}
