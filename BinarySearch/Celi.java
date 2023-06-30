import java.util.Arrays;

public class Celi {
    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 5, 9, 5, 10, 4, 5, 5 };
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
        int key = 8;
        int low = 0;
        int ans = -1;
        int high = arr.length - 1;
        int mid = low + (high - low) / 2;
        while (low <= high) {
            if (arr[mid] >= key) {
                ans = mid;
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
            mid = low + (high - low) / 2;
        }

        System.out.println(ans);
    }
}
