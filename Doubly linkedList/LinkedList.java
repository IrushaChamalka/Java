public class LinkedList {
    
    Node head;

    LinkedList(){
        this.head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void addFirst(Object value){
        Node node = new Node(value);
        if(isEmpty()){
            head = node;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        
    }

    public void addLast(Object value){
        Node node = new Node(value);
        if(isEmpty()){
            addFirst(value);
            return;
        }
        Node temp = head;
        for(int i = 0; i<getSize()-1 ; i++){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;

    }

    public void insert(int index,Object value){

        if(index > getSize() || index < 0){
            System.out.println("invalid index");
            return;
        }
        if(index == 0){
            addFirst(value);
            return;
        }
        if(index == getSize()-1){
            addLast(value);
            return;
        }

        Node node = new Node(value);
        Node temp = head;
        for(int i = 0; i < index-1 ; i++){
            temp = temp.next;
        }

        node.next = temp.next;
        

        if(temp.next == null){
            temp.next.prev = node;
        }
        temp.next = node;
        node.prev = temp;
        
    }

    public void deleteFirst(){
        if(isEmpty()){
            System.out.println("Empty list");
            return;
        }
        head.next.prev = null;
        head = head.next;
    }

    public void deleteLast(){
        if(isEmpty()){
            System.out.println("Empty list");
            return;
        }
        if(getSize() == 1){
            deleteFirst();
            return;
        }
        Node temp = head;
        for(int i = 0; i<getSize()-2; i++){
            temp = temp.next;
        }
        temp.next.prev = null;
        temp.next = null;

    }

    public void deleteIndex(int index){
        if(index > getSize() || index < 0){
            System.out.println("invalid index");
            return;
        }
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == getSize()-1){
            deleteLast();
            return;
        }
        Node temp = head;
        for(int i = 0; i<index-1 ;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }

    public int search(Object value){

        Node temp = head;
        int count = 0;
        while(temp != null){
            if(temp.data == value){
                return count;
            }
            count++;
            temp = temp.next;
        }
        return count;

    }

    public void deleteValue(Object value){
       
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if(temp.data == value){
                deleteIndex(count);
                count--;
            }
            count++;
            temp = temp.next;
        }
        
    }
    
    // public void reverse(){
    //     Node temp = head;
    //     while ((temp.next != null)) {
    //         temp = temp.next;
    //     }
    //     Node current = head;
        
    // }

    public void reverse() {
        Node temp = null;
        Node current = head;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}
