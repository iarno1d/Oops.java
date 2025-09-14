package DSA;
class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top; // Index of the top element

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // 1. Push: Add an element to the top
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push " + value);
            return;
        }
        top++;
        stackArray[top] = value;
    }

    // 2. Pop: Remove and return the top element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1; // Return an error value
        }
        int value = stackArray[top];
        top--;
        return value;
    }

    // 3. Peek: Return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek.");
            return -1;
        }
        return stackArray[top];
    }

    // 4. Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // 5. Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class Stacks {
    public static void main(String[] args) {
        Stack plateStack = new Stack(3);

        plateStack.push(10);
        plateStack.push(20);
        plateStack.push(30);
        plateStack.push(40); // This will show "Stack is full!"

        System.out.println("Top plate is: " + plateStack.peek()); // Output: 30

        System.out.println("Popping: " + plateStack.pop()); // Output: 30
        System.out.println("Popping: " + plateStack.pop()); // Output: 20

        System.out.println("Is the stack empty? " + plateStack.isEmpty()); // Output: false
    }
}