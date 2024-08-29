package Step06_LinkedList.Prep05_HardLL;

import java.util.HashMap;
import java.util.Map;

public class P04_CopyRandomPointerLL {

    public Node copyRandomList(Node head) {
        Node tempHead = head;

        // Inserting the Node
        while (tempHead != null){
            Node tempNode = new Node(tempHead.val);
            tempNode.next = tempHead.next;
            tempHead.next = tempNode;
            tempHead = tempNode.next;
        }

        // Connecting the Random Pointer
        tempHead = head;
        while (tempHead != null){
            if (tempHead.random != null){
                tempHead.next.random = tempHead.random.next;
            }
            else{
                tempHead.next.random = null;
            }
            tempHead = tempHead.next.next;
        }

        // Connecting the Next Pointer Or Extracting the list
        Node copyNode = new Node(-1);
        Node copyNodeHead = copyNode;
        tempHead = head;
        while (tempHead != null){
            copyNode.next = tempHead.next;
            tempHead.next = tempHead.next.next;
            copyNode = copyNode.next;
            tempHead = tempHead.next;
        }
        return  copyNodeHead.next;
    }



    public Node copyRandomListBrute(Node head) {
        Map<Node, Node> newNode = new HashMap<>();
        Node res = new Node(-1);
        Node resHead = res;
        Node tempHead = head;
        while (tempHead != null){
            res.next = new Node(tempHead.val);
            res = res.next;
            newNode.put(tempHead, res);
            tempHead = tempHead.next;
        }
        tempHead = head;
        while (tempHead != null){
            if(tempHead.random == null) newNode.get(tempHead).random = null;
            else{
                newNode.get(tempHead).random = newNode.get(tempHead.random);
            }
            tempHead = tempHead.next;
        }

        return resHead.next;
    }


    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
