
public class Stack {
    public int top;
    public int Stack[];
    public int size;

    Stack(int size) {
        this.size = size;
        Stack = new int[size];
        top = -1;

    }

    public void push(int element) {
        if (size - top < 0) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            Stack[top] = element;

        }
    }

    public int pop() {
        if (top >= 0) {
            int element = Stack[top];
            top--;
            return element;
        } else {
            System.out.println("Stack Overflow");

        }
        return -1;
    }

    public int peek() {
        if (top >= 0) {
            return Stack[top];
        } else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        s.push(10);
        System.out.println(s.peek());
    }
}
