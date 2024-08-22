package Step06_LinkedList.Prep03_MediumLL;

import Step06_LinkedList.ListNode;

import java.util.HashSet;

public class P03_CycleInLL {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    public boolean hasCycleExtraSpace(ListNode head) {
        HashSet<ListNode> visited_nodes = new HashSet<>();
        ListNode current_node = head;
        while (current_node != null) {
            if (visited_nodes.contains(current_node)) {
                return true;
            }
            visited_nodes.add(current_node);
            current_node = current_node.next;
        }
        return false;
    }
}
