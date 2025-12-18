public class DoubleLinkedList {
    Node head;
    Node tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(tail == null) {
            head = tail = newNode;
        }else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertBefore(int data,int key) {
        Node current = head;
        while(current != null && current.data != key){
            current = current.next;
        }
        if(current == null) {
            System.out.println("Node with value "+key+" not found");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = current;
        newNode.prev = current.prev;
        current.prev.next = newNode;
        current.prev = newNode;
    }

    public void insetAfter(int data,int key) {
        Node current = head;
        while(current != null && current.data != key){
            current = current.next;
        }
        if(current == null) {
            System.out.println("Node with value "+key+" not found");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
    }

    public boolean find(int key) {
        Node current = head;
        while(current != null){
            if (current.data == key) return true;
            current = current.next;
        }
        return false;
    }

    public void delete(int key) {
        if(head == null) return;
        Node current = head;
        while(current != null && current.data != key){
            current = current.next;
        }
        if(current == head) {
            head = current.next;
            if(head != null){
                head.prev = null;
            }else tail = null;
        }else if(current == tail) {
            tail = current.prev;
            tail.next = null;
        }else {
            current.next.prev = current.prev;
            current.prev.next = current.next;
        }
        current.next = null;
        current.prev = null;
    }
}
