package Step06_LinkedList.Prep02_LearnDoublyLinkedList;

public class P03_DeletionDLL {
    public Node deleteNode(Node head, int x) {
        if (head == null || x <= 0) {
            return null;
        }

        Node current = head;
        if (x == 1) {
            current = current.next;
            if (current != null) {
                head.next = null;
                current.prev = null;
            }
            return current;
        }

        while (current != null && x != 1) {
            current = current.next;
            x--;
        }

        if (current == null) {
            return head;
        }

        current.prev.next = current.next;
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        current.prev = null;
        current.next = null;
        return head;
    }

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int x) {
            data = x;
            next = null;
            prev = null;
        }
    }
}
