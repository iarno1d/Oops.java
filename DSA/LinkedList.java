package DSA;
// Class to represent each Node in the list
class Node {
    int data;
    Node next; // Reference to the next node

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Class to handle the Linked List operations
class LL {
    Node head; // The first node of the list

    // 1. Inserting at the end (Append)
    public void append(int data) {
        Node newNode = new Node(data);
        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }
        // Otherwise, traverse to the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        // Make the last node point to the new node
        last.next = newNode;
    }

    // 2. Inserting at the beginning (Prepend)
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // New node points to the old head
        head = newNode;      // New node becomes the new head
    }

    // 3. Deleting a node with a given value
    public void deleteWithValue(int data) {
        // If the list is empty, do nothing
        if (head == null) return;
        // If the head itself is to be deleted
        if (head.data == data) {
            head = head.next;
            return;
        }
        // Traverse the list to find the node to delete
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next; // Bypass the node to be deleted
                return;
            }
            current = current.next;
        }
    }

    // 4. Printing the list (Traversing)
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedList {
    public static void main(String[] args) {
        LL myList = new LL();

        myList.append(10); // List: 10
        myList.append(20); // List: 10 -> 20
        myList.append(30); // List: 10 -> 20 -> 30
        myList.prepend(5); // List: 5 -> 10 -> 20 -> 30

        myList.printList(); // Output: 5 -> 10 -> 20 -> 30 -> null

        myList.deleteWithValue(20); // Delete node with value 20
        myList.printList(); // Output: 5 -> 10 -> 30 -> null
    }
}