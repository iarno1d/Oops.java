package DSA;
class Stack {
    int[] arr;
    int top, size;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (top == -1) return -1;
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}
