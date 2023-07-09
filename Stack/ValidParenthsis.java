import java.util.Stack;

public class ValidParenthsis {

    public static boolean solve(Stack<Character> s, String s1) {
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                s.push(ch);
            } else {
                if (!s.isEmpty()) {
                    int top = s.peek();
                    if ((ch == '}' && top == '{') || (ch == ']' && top == '[') || (ch == ')' && top == '(')) {
                        s.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }

        }
        if (s.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        String s1 = "{([])}";
        String s2 = "[({)]";
        Stack<Character> s = new Stack<>();
        if (solve(s, s1)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
        if (solve(s, s2)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
