package Step06_LinkedList.Prep03_MediumLL;

import Step06_LinkedList.ListNode;

public class P06_CheckPalindromeLL {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode left = head;
        ListNode right = reverseList(slow);

        while(left != null && right != null){
            if(left.val != right.val) return  false;
            left = left.next;
            right = right.next;
        }
        return  true;
    }

    private ListNode reverseList(ListNode head){
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
}
