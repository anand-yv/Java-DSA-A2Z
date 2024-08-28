package Step06_LinkedList.Prep03_MediumLL;

import Step06_LinkedList.ListNode;

public class P14_Add2LL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resNode = new ListNode(-1);
        ListNode resHead = resNode;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;

            int sum = l1Val + l2Val + carry;
            int resVal = sum % 10;
            carry = sum / 10;

            resNode.next = new ListNode(resVal);
            resNode = resNode.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return resHead.next;
    }
}
