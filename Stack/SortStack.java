import java.util.Stack;

public class SortStack {

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

    public static void sortInsert(Stack<Integer> s, int num) {
        if (s.empty() || (!s.empty() && s.peek() < num)) {
            s.push(num);
            return;

        }
        int topelement = s.peek();
        s.pop();
        sortInsert(s, num);
        s.push(topelement);

    }

    public static void solve(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }
        int num = s.peek();
        s.pop();
        solve(s);
        sortInsert(s, num);

    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();

        s.push(50);
        s.push(20);
        s.push(10);
        s.push(40);
        s.push(30);
        printStack(s);
        solve(s);
        System.out.println();
        printStack(s);

    }

}
