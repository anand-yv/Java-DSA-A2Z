package Step06_LinkedList.Prep02_LearnDoublyLinkedList;

public class P02_InsertionDLL {
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
