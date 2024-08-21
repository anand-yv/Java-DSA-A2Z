package Step06_LinkedList.Prep02_LearnDoublyLinkedList;

import org.w3c.dom.Node;

public class P01_ArrayToDLL {
    Node constructDLL(int[] arr) {
        // Code here
        Node pres = new Node(arr[0]);
        Node head = pres;
        for(int  i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            pres.next = temp;
            temp.prev = pres;
            pres = temp;
        }
        return head;
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
