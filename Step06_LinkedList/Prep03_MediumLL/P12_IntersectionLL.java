package Step06_LinkedList.Prep03_MediumLL;

import Step06_LinkedList.ListNode;

public class P12_IntersectionLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        int headALength = lengthOfLL(headA);
        int headBLength = lengthOfLL(headB);
        int diff = Math.abs(headALength - headBLength);

        while(headALength > headBLength){
            headA = headA.next;
            headALength--;
        }

        while (headBLength > headALength){
            headB = headB.next;
            headBLength--;
        }

        while (headA != null && headB != null){
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    private int lengthOfLL(ListNode head){
        int len = 0;
        while (head != null){
            head = head.next;
            len++;
        }
        return len;
    }
}
