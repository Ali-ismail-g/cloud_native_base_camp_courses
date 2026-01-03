public class Stack {
    private Node head;
    private int length;

    public Stack() {
        this.head = null;
        this.length = 0;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public int pop(){
        if(isEmpty()){throw new RuntimeException("Stack is empty!!");}
        int poppedValue = head.data;
        head = head.next;
        length--;
        return poppedValue;
    }

    public int peek(){return head.data;}

    public void print(){
        if(isEmpty()){throw new RuntimeException("Stack is empty!!");}
        Node temp = head;
        while(temp !=null){
            System.out.println("(" + temp.data + ")");
            temp = temp.next;
        }
    }

    public int size(){return length;}

    public boolean isEmpty(){ return length == 0;}
}
