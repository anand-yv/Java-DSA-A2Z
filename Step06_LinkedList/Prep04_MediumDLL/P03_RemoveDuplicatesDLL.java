package Step06_LinkedList.Prep04_MediumDLL;

public class P03_RemoveDuplicatesDLL {
    Node removeDuplicates(Node head){
        // Code Here.
        Node current = head;
        while (current != null) {
            Node nextDistinct = current.next;
            while (nextDistinct != null && current.data == nextDistinct.data) {
                nextDistinct = nextDistinct.next;
            }
            current.next = nextDistinct;
            if (nextDistinct != null) {
                nextDistinct.prev = current;
            }
            current = nextDistinct;
        }
        return head;
    }

    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
