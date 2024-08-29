package Step06_LinkedList.Prep05_HardLL;

import Step06_LinkedList.ListNode;

public class P01_ReversKGroupLL {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null || head.next == null) return head;
        ListNode pres = head;
        ListNode prev = null;
        while (pres != null){
            ListNode kNode = findKNode(pres, k);
            if(kNode == null){
                if(prev != null) prev.next = pres;
                break;
            }
            ListNode next = kNode.next;
            kNode.next = null;
            reverseLL(pres);
            if(pres == head){
                head = kNode;
            } else {
                prev.next = kNode;
            }
            prev = pres;
            pres = next;
        }
        return head;
    }

    private ListNode findKNode(ListNode head, int k) {
        k -= 1;
        while (head != null && k > 0){
            head = head.next;
            k--;
        }
        return head;
    }

    private void reverseLL(ListNode pres) {
        if(pres == null || pres.next == null) return;
        ListNode prev = null;
        while (pres != null){
            ListNode next = pres.next;
            pres.next = prev;
            prev = pres;
            pres = next;
        }
    }
}
