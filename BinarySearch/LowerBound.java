import java.util.Arrays;

public class LowerBound {

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5, 9, 5, 10, 4, 5, 5 };
        Arrays.sort(arr);
        int key = 5;
        int low = 0;
        int ans = arr.length;
        int high = arr.length - 1;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            if (arr[mid] >= key) {
                ans = mid;
                high = mid - 1;
            }

            // If X is greater arr[mid]
            // then find in right subarray
            else {
                low = mid + 1;
            }
            mid = low + (high - low) / 2;
        }

        System.out.println(ans);
    }
}
