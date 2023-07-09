import java.util.Stack;

public class NextSmaller {
    public static void solve(int arr[], Stack<Integer> stack, int ans[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];
            while (stack.peek() >= curr) {
                stack.pop();

            }
            ans[i] = stack.peek();
            stack.push(curr);

        }

    }

    public static void main(String arg[]) {
        int arr[] = { 2, 1, 4, 3 };
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];
        stack.push(-1);

        solve(arr, stack, ans);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
