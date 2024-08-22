package Step06_LinkedList.Prep03_MediumLL;
import Step06_LinkedList.ListNode;

public class P02_ReverseLL {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode pres = head;
        while(pres != null){
            ListNode next = pres.next;
            pres.next = prev;
            prev = pres;
            pres = next;
        }
        return prev;
    }

    public ListNode reverseSLL(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseSLL(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
