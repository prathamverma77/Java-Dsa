package LinkedLists;

public class singlyLinkedLists {

    static class Node {
        int data;
        Node next;
        //constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    //constructor
    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;

    }


    //INSTERSTIONS all code functions




    //insert at head function
    public voice insertAtHead(int data){
        //todo
        Node newNode = new Node(data);
        //if LL is empty -> head and tail ko newNode pr point krdo
        if(head == null && tail == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        //increase the size by 1
        size++;
    }


    //insert at end function
    public void insertAtTail(int data){
        //todo
        Node newNode = new Node(data);
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //positioning is 1-based indexing
    

}
