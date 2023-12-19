package LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        Linkedlist linkedlist = new Linkedlist();

        linkedlist.insertFirst(20);
        linkedlist.insertFirst(230);
        linkedlist.insertFirst(40);
        linkedlist.insertFirst(580);
        linkedlist.delete(1);
        linkedlist.printList();
    }
}
