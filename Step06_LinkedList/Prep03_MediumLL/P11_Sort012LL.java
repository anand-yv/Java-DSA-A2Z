package Step06_LinkedList.Prep03_MediumLL;

public class P11_Sort012LL {
    static Node segregate(Node head) {
        // add your code here
        if(head == null || head.next == null) return head;

        Node tempHead = head;

        Node zero = new Node(-1);
        Node zeroHead = zero;
        Node one = new Node(-1);
        Node oneHead = one;
        Node two = new Node(-1);
        Node twoHead = two;

        while (tempHead != null){
            if (tempHead.data == 0){
                zero.next = tempHead;
                zero = zero.next;
            } else if (tempHead.data == 1) {
                one.next = tempHead;
                one = one.next;
            } else if (tempHead.data == 2) {
                two.next = tempHead;
                two = two.next;
            }
            tempHead = tempHead.next;
        }

        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
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
