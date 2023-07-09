import java.util.Stack;

public class DeleteMiddleElement {

    public static void solution(int count, int size, Stack<Integer> s) {
        if (count == size / 2) {
            s.pop();
            return;
        }

        int num = s.pop();
        solution(count + 1, size, s);
        s.push(num);

    }

    public static void PrintStack(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<Integer>();

        while (s.empty() == false) {
            temp.push(s.peek());
            s.pop();
        }

        while (temp.empty() == false) {
            int t = temp.peek();
            System.out.print(t + " ");
            temp.pop();

            // To restore contents of
            // the original stack.
            s.push(t);
        }
    }

    public static void main(String args[]) {
        int count = 0;
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        int size = s.size();
        PrintStack(s);
        solution(count, size, s);
        System.out.println();
        PrintStack(s);

    }

}
