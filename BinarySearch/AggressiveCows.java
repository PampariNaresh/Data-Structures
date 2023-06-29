import java.util.*;

class AggressiveCows {
    public static boolean possiblePosition(int arr[], int mid, int cows) {
        int nCows = 1;
        int last = arr[0];

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] - last >= mid) {
                nCows++;
                last = arr[i];
            }
            if (nCows >= cows)
                return true;
        }
        return false;
    }

    public static void main(String args[]) {
        /*
         * Problem Statement of Book Allocation:
         * INPUT:
         * Number of Pages in i th book in arr[i]
         * Number of Students -m
         * CONDITIONS:
         * 1.Each students gets at least one book
         * 2.Each * 3.Book allocation should bw in contigoues manner
         * OUTPUT:
         * 1.Allocte the books to "m" students
         * 2.maximum number of pages assigned to a student is minimum
         */
        int arr[] = { 0, 4, 3, 7, 9, 10 };
        Arrays.sort(arr);

        int n = arr.length;
        int cows = 4;
        int low = 1;
        int high = arr[n - 1] - arr[0];
        int mid = low + (high - low) / 2;
        int ans = -1;
        while (low <= high) {

            if (possiblePosition(arr, mid, cows) == true) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;

            }
            mid = low + (high - low) / 2;

        }
        System.out.println(ans);

    }
}
