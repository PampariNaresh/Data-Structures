import java.util.Stack;

// Using In-Bulit Stack Class 
public class StackClass {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.empty());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.search(3));
        System.out.println(s.capacity());
        System.out.println(s.size());

    }
}