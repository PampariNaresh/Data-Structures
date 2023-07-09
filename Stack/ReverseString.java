import java.util.Stack;

public class ReverseString {
    public static void main(String args[]) {
        String s = "Pampari Naresh";
        char[] charArray = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        String reverseString = "";
        for (int i = 0; i < charArray.length; i++) {
            stack.push(charArray[i]);
        }
        for (int i = 0; i < charArray.length; i++) {
            reverseString += stack.pop();
        }
        System.out.println(reverseString);

    }
}
