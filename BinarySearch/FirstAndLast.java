
public class FirstAndLast {
    /*
     * public static int lowerbound(int arr[], int key) {
     * int ans = -1;
     * int start = 0;
     * int end = arr.length;
     * int mid = start + (end - start) / 2;
     * while (start <= end) {
     * if (arr[mid] >= key) {
     * ans = mid;
     * end = mid - 1;
     * } else {
     * start = mid + 1;
     * }
     * mid = start + (end - start) / 2;
     * }
     * return ans;
     * }
     * 
     * public static int upperbound(int arr[], int key) {
     * int ans = -1;
     * int start = 0;
     * int end = arr.length;
     * int mid = start + (end - start) / 2;
     * while (start <= end) {
     * if (arr[mid] > key) {
     * ans = mid;
     * end = mid - 1;
     * } else {
     * start = mid + 1;
     * }
     * mid = start + (end - start) / 2;
     * }
     * return ans;
     * }
     */

    // Binary Search Method
    public static int firstOccurrence(int arr[], int key) {
        int first = -1;
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] == key) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] < key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return first;
    }

    public static int lastOccurrence(int arr[], int key) {
        int last = -1;
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] == key) {
                last = mid;
                start = mid + 1;
            } else if (arr[mid] < key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return last;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 8, 8, 11, 13 };
        int key = 8;
        /*
         * Iteration method-O(n)
         * int first = -1;
         * int last = -1;
         * for (int i = 0; i < arr.length; i++) {
         * if (arr[i] == key) {
         * if (first == -1)
         * first = i;
         * last = i;
         * }
         * }
         * System.out.println(first);
         * System.out.println(last);
         * System.out.println(first);
         * System.out.println(last);
         */

        /*
         * LowerBound and UpperBound Method:
         * int lb = lowerbound(arr, key);
         * int up = upperbound(arr, key);
         * if (lb == arr.length && arr[lb] != key) {
         * System.out.println("-1");
         * System.out.println("-1");
         * } else {
         * System.out.println(lb);
         * System.out.println(up - 1);
         * }
         */

        System.out.println(firstOccurrence(arr, key));
        System.out.println(lastOccurrence(arr, key));
    }
}
