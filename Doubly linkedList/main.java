public class main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("cat");
        linkedList.addFirst('A');
        linkedList.addFirst(45);
        linkedList.addLast("kamal");
        linkedList.addLast(55);
        linkedList.addLast(5.5);
        linkedList.addLast("45");
        linkedList.insert(3, 44);

        linkedList.display();

        // linkedList.deleteFirst();
        // linkedList.deleteLast();
        //System.out.println(linkedList.getSize());
        //linkedList.deleteIndex(4);
        //System.out.println("search value index:" + linkedList.search(44));
        linkedList.deleteValue("45");
        //linkedList.reverse();
        linkedList.display();
    }
}
