import java.util.Stack;

public class ReverseStackRecursion {

    public static void printStack(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) {
            temp.push(s.peek());
            s.pop();
        }
        while (!temp.isEmpty()) {
            int element = temp.peek();
            System.out.print(element + " ");
            temp.pop();
            s.push(element);
        }
        System.out.println();
    }

    public static void insertAtBottom(Stack<Integer> s, int insertelement) {
        if (s.isEmpty()) {
            s.push(insertelement);
            return;

        }
        int num = s.peek();
        s.pop();
        insertAtBottom(s, insertelement);
        s.push(num);

    }

    public static void solve(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }
        int num = s.peek();
        s.pop();
        solve(s);
        insertAtBottom(s, num);

    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        printStack(s);
        solve(s);
        System.out.println();
        printStack(s);

    }

}
