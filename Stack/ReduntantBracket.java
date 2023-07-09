import java.util.Stack;

public class ReduntantBracket {
    public static boolean solve(Stack<Character> stack, String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    boolean isReduntant = true;
                    while (stack.peek() != '(') {
                        char top = stack.peek();
                        if (top == '*' || top == '/' || top == '+' || top == '-') {
                            isReduntant = false;
                        }
                        stack.pop();
                    }

                    if (isReduntant == true) {
                        return true;
                    }
                    stack.pop();
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String s = "((a+b))";
        Stack<Character> stack = new Stack<>();
        if (solve(stack, s)) {
            System.out.println("Reduntant");
        } else {
            System.out.println("Not Reduntant");
        }
    }
}
