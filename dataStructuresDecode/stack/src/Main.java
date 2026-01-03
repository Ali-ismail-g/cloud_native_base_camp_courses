public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.print();
        System.out.println("---------------------");
        myStack.pop();
        myStack.peek();
        myStack.size();
        myStack.print();
    }
}