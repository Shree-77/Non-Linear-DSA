package LinkedList.SinglyLinkedList;

public class Linkedlist {

    Node head ;
    Node tail;
    int size =0;

    public Linkedlist(){
        this.size=0;
    }

    class Node{
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    public  void insertFirst(int value){
        Node node = new Node(value);
        Node temp = head;
        head=node;
        head.next=temp;

        if(tail==null){
            tail=head;
        }
        size++;
    }

    public  void insertLast(int value){
        if(tail==null){
            insertFirst(value);
        }
        Node node = new Node(value);
        Node temp = tail;
        tail=node;
        temp.next=tail;
        size++;
    }

    public void insert(int value , int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp = head;

        for (int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next=node;

        size++;

    }

    public void printList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.print("End");
    }





}
