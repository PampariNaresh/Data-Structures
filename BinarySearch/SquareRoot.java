public class SquareRoot {

    public static int squareRoot(int n) {
        int low = 0;
        int high = n;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            int sq = mid * mid;
            if (sq == n) {
                return mid;

            }
            if (sq < n) {

                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = low + (high - low) / 2;
        }
        return -1;

    }

    public static float precision(int n, int precision, int squareRoot) {
        float factor = 1;
        float ans = squareRoot;
        for (int i = 0; i < precision; i++) {
            factor = factor / 10;
            for (float j = ans; j * j < n; j = j + factor) {
                ans = j;
            }

        }
        return ans;

    }

    public static void main(String args[]) {

        int n = 65;
        int squareRoot = squareRoot(n);
        float decimalRoot = precision(n, 3, squareRoot);
        System.out.println(decimalRoot);
    }
}
