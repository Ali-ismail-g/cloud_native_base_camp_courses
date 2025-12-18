public class MyLinkedList {
    Node head;
    Node tail;
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        } else if(tail == null){
            tail = newNode;
            head.next = tail;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = newNode;
        }
    }

    public void insertAfter(int key, int data) {
        Node current = head;
        while (current != null && current.data != key){
            current = current.next;
        }
        if(current == null) {
            System.out.println("Node with value "+key+" not found");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    public void insertBefore(int key, int data) {
        Node prev = null;
        Node current = head;
        while (current != null && current.data != key){
            prev = current;
            current = current.next;
        }
        if(current == null) {
            System.out.println("Node with value "+key+" not found");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = current;
        if(prev ==null) {
            prev = head;
        }else {
            prev.next = newNode;
        }
    }

    public int findBeforeSpecificNode(int key){
        if(head == null || head.data == key){
            return 0;
        }
        Node prev = head;
        Node current = prev.next;
        while (current != null && current.data != key){
            prev = current;
            current = current.next;
        }
        return prev.data;
    }

    public void deleteNode(int key) {
        if(head == null) return;
        Node prev = null;
        Node current = head;
        while (current != null && current.data != key){
            prev = current;
            current = current.next;
        }
        if(current == head){
            head = current.next;
            prev = head;
            return;
        }
        prev.next = current.next;
        if(current == tail){
            tail = prev;
        }
    }

    public boolean search(int key) {
        Node current = head;
        while (current != null){
            if(current.data == key) return true;
            current = current.next;
        }
        return false;
    }


    public void printLinkedList() {
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node current = head;
        while(current.next != null) {
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.println(current.data);
    }
}
