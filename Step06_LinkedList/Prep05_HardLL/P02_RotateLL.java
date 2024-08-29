package Step06_LinkedList.Prep05_HardLL;

import Step06_LinkedList.ListNode;

public class P02_RotateLL {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        int len = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        k = k % len;
        if (k == 0) return head;
        tail.next = head;
        ListNode newNode = findKthNode(head, len - k);
        head = newNode.next;
        newNode.next = null;
        return head;
    }

    private ListNode findKthNode(ListNode head, int k) {
        k -= 1;
        while (head != null && k > 0) {
            head = head.next;
            k--;
        }
        return head;
    }
}
