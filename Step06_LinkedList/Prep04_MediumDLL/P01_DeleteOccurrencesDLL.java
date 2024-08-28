package Step06_LinkedList.Prep04_MediumDLL;

public class P01_DeleteOccurrencesDLL {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node tempHead = head;
        while (tempHead != null){
            if(tempHead.data == x){
                if(tempHead == head){
                    head = tempHead.next;
                }

                Node nextNode = tempHead.next;
                Node prevNode = tempHead.prev;
                if (nextNode != null) nextNode.prev = prevNode;
                if (prevNode != null) prevNode.next = nextNode;
                tempHead = nextNode;
            }
            else {
                tempHead = tempHead.next;
            }

        }
        return head;
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
