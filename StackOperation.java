

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class
class Stack {

    Node top;
    int count = 0;

    // Push operation
    void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;

        count++;

        System.out.println(data + " inserted");
    }

    // Pop operation
    int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = top.data;

        top = top.next;

        count--;

        return value;
    }

    // Peek operation
    int peek() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return top.data;
    }

    // Check whether Stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // Find size of Stack
    int size() {
        return count;
    }

    // Display Stack elements
    void display() {

        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}

// Main class
public class StackOperation{

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("\nStack elements:");
        s.display();

        System.out.println("Top element: " + s.peek());

        System.out.println("Removed: " + s.pop());

        System.out.println("Stack after pop:");
        s.display();

        System.out.println("Size: " + s.size());

        System.out.println("Is Empty: " + s.isEmpty());

        System.out.println("Removed: " + s.pop());
        System.out.println("Removed: " + s.pop());

        System.out.println("Is Empty: " + s.isEmpty());

        s.pop();
    }
}

    

