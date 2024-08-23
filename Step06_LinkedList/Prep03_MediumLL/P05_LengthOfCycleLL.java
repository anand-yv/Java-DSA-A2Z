package Step06_LinkedList.Prep03_MediumLL;


public class P05_LengthOfCycleLL {
    private int countNodesInLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                int lengthOfNode = 1;
                fast = fast.next;
                while (fast != slow) {
                    lengthOfNode++;
                    fast = fast.next;
                }
                return lengthOfNode;
            }
        }
        return 0;
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
