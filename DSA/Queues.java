package DSA;

class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front; // Index of the front element
    private int rear;  // Index of the rear element
    private int nItems; // Number of items currently in the queue

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    // 1. Enqueue: Insert an element at the rear
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot add " + value);
            return;
        }
        // Handle wrap-around (circular queue)
        if (rear == maxSize - 1) {
            rear = -1;
        }
        rear++;
        queueArray[rear] = value;
        nItems++;
    }

    // 2. Dequeue: Remove and return the element from the front
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot remove.");
            return -1;
        }
        int value = queueArray[front];
        front++;
        // Handle wrap-around
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return value;
    }

    // 3. Peek: Look at the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queueArray[front];
    }

    // 4. Check if empty
    public boolean isEmpty() {
        return (nItems == 0);
    }

    // 5. Check if full
    public boolean isFull() {
        return (nItems == maxSize);
    }
}

public class Queues {
    public static void main(String[] args) {
        Queue busQueue = new Queue(3);

        busQueue.enqueue(10);
        busQueue.enqueue(20);
        busQueue.enqueue(30);
        busQueue.enqueue(40); // This will show "Queue is full!"

        System.out.println("First person in line: " + busQueue.peek()); // Output: 10

        System.out.println("Dequeuing: " + busQueue.dequeue()); // Output: 10
        System.out.println("Dequeuing: " + busQueue.dequeue()); // Output: 20

        busQueue.enqueue(40); // Now we can add again
        System.out.println("Dequeuing: " + busQueue.dequeue()); // Output: 30
    }
}