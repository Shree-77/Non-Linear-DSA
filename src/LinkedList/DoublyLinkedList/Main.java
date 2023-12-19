package LinkedList.DoublyLinkedList;


public class Main {
    public static void main(String[] args) {
        DoublyLinkedlist doublyLinkedlist=new DoublyLinkedlist();

        doublyLinkedlist.InsertFirst(20);
        doublyLinkedlist.InsertFirst(50);
        doublyLinkedlist.InsertFirst(200);
        doublyLinkedlist.insert(1,2);
        doublyLinkedlist.DeleteFirst();
        doublyLinkedlist.DeleteLast();
        doublyLinkedlist.PrintList();
    }
}
