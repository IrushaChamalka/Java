public class Node {

    Node next;
    Node prev;
    Object data;

    Node(Object data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(Node head,Object data){
        this.next = head;
        this.data = data;
    }
    
}