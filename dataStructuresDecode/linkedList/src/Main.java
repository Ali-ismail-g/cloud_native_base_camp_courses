//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.insertAtHead(0);
        linkedList.insertAtTail(1);
        linkedList.insertAtTail(2);
        linkedList.insertAtTail(3);
        linkedList.insertAtTail(4);
        linkedList.insertAtTail(5);
        linkedList.insertAtTail(6);
        linkedList.insertAfter(3,66);
        linkedList.insertBefore(6,88);
        linkedList.deleteNode(0);
        linkedList.printLinkedList();
        System.out.println(linkedList.findBeforeSpecificNode(6));
        System.out.println(linkedList.search(66));
        System.out.println(linkedList.search(67));
        System.out.println("-------------Double linkedList-------------");
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.insertAtHead(0);
        doubleLinkedList.insertAtTail(1);
        doubleLinkedList.insertBefore(2,1);
        doubleLinkedList.insetAfter(3,1);
        System.out.println(doubleLinkedList.find(5));
        System.out.println(doubleLinkedList.find(2));
        doubleLinkedList.delete(2);
        doubleLinkedList.print();
    }
}