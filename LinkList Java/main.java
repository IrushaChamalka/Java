public class main {
    public static void main(String[] args) {
        LinkList list = new LinkList();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);

        list.display();
        list.insert(100, 2);

        list.display();

        // System.out.println(list.deleteFirst());
        // list.display();

        // System.out.println(list.deleteLast());
        // list.display();

        // System.out.println(list.delete(1));
        // list.display();

    }
}
