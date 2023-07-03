public class SearchRotated {
    public static void main(String args[]) {
        int arr[] = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };
        int low = 0;
        int high = arr.length - 1;
        int mid = low + (high - low) / 2;
        int key = 9;
        while (low <= high) {
            if (arr[mid] == key) {
                System.out.println(mid);
            }
            if (arr[low] < arr[mid]) {
                if (arr[low] <= key && key <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= key && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            mid = low + (high - low) / 2;
        }
        System.out.println("End");
    }
}
