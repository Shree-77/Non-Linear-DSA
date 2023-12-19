package LinkedList.DoublyLinkedList;

public class DoublyLinkedlist {
    private class Node{
        Node prev;
        int value;
        Node next;

        public Node(Node prev, int value,Node next) {
            this.value=value;
            this.prev=prev;
            this.next=next;
        }
        public Node(int value){
            this.value=value;
        }
    }

    Node head;
    Node tail;
    int size=0;

    public DoublyLinkedlist() {
        this.size=0;
    }

    public void InsertFirst(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        node.next=head;
        head.prev=node;
        head=node;
        size++;
    }

    public void InsertLast(int val){
        Node node = new Node(val);
        if(tail==null){
            InsertFirst(val);
            return;
        }
        tail.next=node;
        node.prev=tail;
        tail=node;
        size++;
    }

    public void insert(int index, int val){
        Node node = new Node(val);

        if(index==0)InsertFirst(val);
        if(index==size)InsertLast(val);

        Node current = head;
        while(index >0){
            current=current.next;
            index--;
        }
        Node previous=current.prev;
        node.prev=previous;
        previous.next=node;
        current.prev=node;
        node.next=current;
        size++;
    }

    public void DeleteFirst(){
        if(head==null)return;
        head=head.next;
        head.prev=null;
        size--;
    }

    public void DeleteLast(){
        if(head == null){
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
        }else{
            Node current = head;

            while (current.next != null && current.next != tail) {
                current = current.next;
            }
            current.next=null;
            tail=current;
        }
        size--;
    }

    public void delete(int index){
        Node current=head;
        if(index==0)DeleteFirst();
        if(index==size)DeleteLast();
        while(index>0){
            current=current.next;
            index--;
        }
        Node previous=current.prev;
        previous.next=current.next;
        Node next=current.next;
        next.prev=previous;
    }

    public void PrintList(){
        Node current = head;
        while (current!=null){
            System.out.print(current.value + "->");
            current=current.next;
        }
        System.out.print("END");
    }


}
